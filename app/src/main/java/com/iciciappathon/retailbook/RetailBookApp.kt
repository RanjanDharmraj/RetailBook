package com.iciciappathon.retailbook

import android.app.Activity
import android.support.multidex.MultiDexApplication
import com.iciciappathon.retailbook.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject

class RetailBookApp : MultiDexApplication(), HasActivityInjector {

    @Inject
    lateinit var dispatchingActivityInjector: DispatchingAndroidInjector<Activity>


    override fun activityInjector(): AndroidInjector<Activity> = dispatchingActivityInjector


    override fun onCreate() {
        super.onCreate()
        initializeAppComponent()
    }

    fun initializeAppComponent() {
        DaggerAppComponent.builder()
            .application(this)
            .build()
            .inject(this)
    }

}