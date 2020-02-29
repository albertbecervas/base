package com.abecerra.base.presentation

import com.abecerra.base.PresenterConfigurator

abstract class BasePresenterFragment<PRESENTER>(
    private val presenterConfigurator: PresenterConfigurator<PRESENTER>
) : BaseFragment() {

    fun getPresenter(): PRESENTER? {
        return presenterConfigurator.getPresenter()
    }
}