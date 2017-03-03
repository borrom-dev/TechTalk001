package com.angkorsuntrix.techtalk001.profile

import android.os.Bundle
import com.angkorsuntrix.techtalk001.base.BaseFragment

class ProfileFragment : BaseFragment(), ProfileView {

    private lateinit var mProfilePresenter: ProfilePresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mProfilePresenter.getProfile()
    }

    override fun displayError(messageId: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun display(userProfile: String?) {

    }

}
