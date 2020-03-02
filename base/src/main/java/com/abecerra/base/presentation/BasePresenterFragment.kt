package com.abecerra.base.presentation

import android.os.Bundle
import com.abecerra.base.PresenterConfigurator

abstract class BasePresenterFragment<PRESENTER>(
    private val presenterConfigurator: PresenterConfigurator<PRESENTER>
) : BaseFragment() {

    protected var presenter: PRESENTER? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        presenter = presenterConfigurator.getPresenter()
    }
}