package com.angkorsuntrix.techtalk001.profile

import android.os.Bundle
import com.angkorsuntrix.techtalk001.base.BasePresenter

class ProfilePresenter(var mProfileInteractor: ProfileInteractor) : BasePresenter<ProfileView>() {

    override fun attachView(view: ProfileView) {
        super.attachView(view)
    }


    fun getProfile() {
        mView!!.display("Hello, World")
    }

    override fun getStatus(): Bundle? {
        return null
    }

    override fun loadStatus(bundle: Bundle) {

    }
}
