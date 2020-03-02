package com.abecerra.base.presentation

import android.os.Bundle
import android.os.Parcelable
import com.abecerra.base.PresenterConfigurator

abstract class BasePresenterActivity<PRESENTER : Parcelable> : BaseActivity() {

    protected var presenter: PRESENTER? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        presenter = intent?.getParcelableExtra<PresenterConfigurator<PRESENTER>>("config")
            ?.getPresenter()
    }
}