package com.abecerra.base.presentation

import android.os.Bundle
import com.abecerra.base.PresenterConfigurator

abstract class BasePresenterActivity<PRESENTER> : BaseActivity() {

    protected var presenter: PRESENTER? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        presenter = intent?.getParcelableExtra<PresenterConfigurator<PRESENTER>>(
            PRESENTER_CONFIGURATOR_KEY
        )?.getPresenter()
    }

    companion object {
        const val PRESENTER_CONFIGURATOR_KEY: String = "presenter_configurator"
    }
}