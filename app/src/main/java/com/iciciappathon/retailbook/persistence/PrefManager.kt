package com.iciciappathon.retailbook.persistence

import android.app.Application
import android.content.SharedPreferences
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class PrefManager @Inject constructor(private val mSharedPreference: SharedPreferences,
                                      private val mContext: Application){

}