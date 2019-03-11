package com.iciciappathon.retailbook.ui.login

import android.arch.lifecycle.ViewModel
import com.iciciappathon.retailbook.di.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class LoginModule {

    @Binds
    @IntoMap
    @ViewModelKey(LoginViewModel::class)
    abstract fun bindLoginViewModel(loginViewModel: LoginViewModel): ViewModel


}