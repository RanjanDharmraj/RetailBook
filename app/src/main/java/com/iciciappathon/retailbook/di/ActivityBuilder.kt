package com.iciciappathon.retailbook.di

import com.iciciappathon.retailbook.ui.login.LoginActivity
import com.iciciappathon.retailbook.ui.login.LoginModule
import com.iciciappathon.retailbook.ui.splash.SplashActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilder {

    abstract fun splashActivity(): SplashActivity

    @ContributesAndroidInjector(modules = [LoginModule::class])
    abstract fun loginActivity(): LoginActivity

}