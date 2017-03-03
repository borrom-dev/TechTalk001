package com.angkorsuntrix.techtalk001

import com.angkorsuntrix.techtalk001.profile.ProfileInteractor
import com.angkorsuntrix.techtalk001.profile.ProfilePresenter
import com.angkorsuntrix.techtalk001.profile.ProfileView
import com.nhaarman.mockito_kotlin.whenever
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito.verify
import org.mockito.MockitoAnnotations

class ProfilePresenterTest {

    private lateinit var mProfilePresenter: ProfilePresenter
    private lateinit var mProfileId: String

    @Mock
    private lateinit var mProfileInteractor: ProfileInteractor

    @Mock
    private lateinit var mProfileView: ProfileView

    @Before
    fun setup() {
        MockitoAnnotations.initMocks(this)
        mProfilePresenter = ProfilePresenter(mProfileInteractor)
        mProfileId = "Hello, World"
        whenever(mProfileInteractor.getProfileId()).thenReturn("Hello, World")
    }

    @Test
    fun getProfileId() {
        Assert.assertEquals("get Profile Id", mProfileId, mProfileInteractor.getProfileId())
    }

    @Test
    @Throws(Exception::class)
    fun attachView() {
        mProfilePresenter.attachView(mProfileView)
        verify(mProfileView).display(mProfileId)
    }
}
