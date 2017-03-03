package com.angkorsuntrix.techtalk001.base;

import android.os.Bundle;
import android.support.annotation.Nullable;

import rx.Subscriber;
import rx.subscriptions.CompositeSubscription;

public abstract class BasePresenter<V extends BaseView> {

    @Nullable
    protected V mView;

    private CompositeSubscription mCompositeSubscription = new CompositeSubscription();

    public void addSubscription(Subscriber subscriber) {
        mCompositeSubscription.add(subscriber);
    }

    public void attachView(V view) {
        mView = view;
    }

    public void detachView() {
        mView = null;

    }

    public void unSubscribeAll() {
        mCompositeSubscription.clear();
    }

    @Nullable
    public V getView() {
        return mView;
    }

    public abstract Bundle getStatus();

    public abstract void loadStatus(Bundle bundle);
}
