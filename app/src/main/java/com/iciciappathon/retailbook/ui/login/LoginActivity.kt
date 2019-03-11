package com.iciciappathon.retailbook.ui.login

import android.os.Bundle
import com.iciciappathon.retailbook.R
import com.iciciappathon.retailbook.ui.base.BaseActivity
import dagger.android.AndroidInjection

/**
 * A login screen that offers login via email/password.
 */
class LoginActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        AndroidInjection.inject(this)
    }

}
