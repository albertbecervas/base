package com.abecerra.base.presentation

import android.os.Bundle
import com.abecerra.base.PresenterConfigurator

abstract class BasePresenterFragment<PRESENTER> : BaseFragment() {

    private var presenterConfigurator: PresenterConfigurator<PRESENTER>? = null

    protected var presenter: PRESENTER? = null

    fun newInstance(presenterConfigurator: PresenterConfigurator<PRESENTER>) {
        this.presenterConfigurator = presenterConfigurator
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        presenter = presenterConfigurator?.getPresenter()
    }
}