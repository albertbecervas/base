package com.abecerra.base

import android.os.Parcelable

interface PresenterConfigurator<PRESENTER>: Parcelable {

    fun getPresenter(): PRESENTER?
}