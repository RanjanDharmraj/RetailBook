package com.iciciappathon.retailbook.ui.base

import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import android.arch.lifecycle.MutableLiveData
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlin.coroutines.CoroutineContext

abstract class BaseViewModel(application: Application) : AndroidViewModel(application), CoroutineScope {

    val errorText = MutableLiveData<String>()
    val errorLayoutVisibility = MutableLiveData<Int>()

    val title = MutableLiveData<String>()
    val subtitle = MutableLiveData<String>()

    lateinit var job: Job
    override val coroutineContext: CoroutineContext
        get() = Dispatchers.Main + job

    open fun onNetworkRetry() {

    }

    override fun onCleared() {
        super.onCleared()
        job.cancel() // Cancel job on activity destroy. After destroy all children jobs will be cancelled automatically
    }

}