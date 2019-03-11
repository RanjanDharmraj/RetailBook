package com.iciciappathon.retailbook.ui.base

import android.annotation.SuppressLint
import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.app.AppCompatDelegate

@SuppressLint("Registered")
abstract class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true)
    }
}