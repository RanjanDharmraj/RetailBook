package com.iciciappathon.retailbook.ui.splash

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import com.iciciappathon.retailbook.R
import com.iciciappathon.retailbook.ui.base.BaseActivity
import com.iciciappathon.retailbook.ui.home.HomeActivity
import dagger.android.AndroidInjection

class SplashActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        Handler().postDelayed(Runnable {
            moveToHomeActivity()
        },3000)
    }

    private fun moveToHomeActivity() {
        startActivity(Intent(this, HomeActivity::class.java))
    }
}
