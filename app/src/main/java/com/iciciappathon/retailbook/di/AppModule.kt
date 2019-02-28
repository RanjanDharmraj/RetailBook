package com.iciciappathon.retailbook.di

import android.app.Application
import dagger.Module
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.Retrofit
import okhttp3.OkHttpClient
import com.google.gson.Gson
import javax.inject.Singleton
import dagger.Provides
import com.google.gson.FieldNamingPolicy
import com.google.gson.GsonBuilder
import android.preference.PreferenceManager
import android.content.SharedPreferences
import com.iciciappathon.retailbook.BuildConfig
import com.iciciappathon.retailbook.network.ApiService
import com.iciciappathon.retailbook.persistence.PrefManager
import dagger.Binds
import okhttp3.Cache


@Module
abstract class AppModule {

    @Binds
    abstract fun provideSharedPreference(sharedPreferenceStorage: SharedPreferences, application: Application): PrefManager


    companion object {
        // Dagger will only look for methods annotated with @Provides
        @Provides
        @Singleton
        @JvmStatic
        fun providesSharedPreferences(application: Application): SharedPreferences =
            PreferenceManager.getDefaultSharedPreferences(application)

        @Provides
        @Singleton
        @JvmStatic
        fun provideOkHttpCache(application: Application): Cache {
            val cacheSize: Long = 10 * 1024 * 1024 // 10 MiB
            return Cache(application.cacheDir, cacheSize)
        }

        @Provides
        @Singleton
        @JvmStatic
        fun provideGson(): Gson {
            val gsonBuilder = GsonBuilder()
            gsonBuilder.setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
            return gsonBuilder.create()
        }

        @Provides
        @Singleton
        @JvmStatic
        fun provideOkHttpClient(cache: Cache): OkHttpClient {
            val client = OkHttpClient.Builder()
            client.cache(cache)
            return client.build()
        }

        @Provides
        @Singleton
        @JvmStatic
        fun provideRetrofit(gson: Gson, okHttpClient: OkHttpClient): Retrofit {
            return Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create(gson))
                .baseUrl(BuildConfig.API_ENDPPOINT)
                .client(okHttpClient)
                .build()
        }

        @Provides
        @Singleton
        @JvmStatic
        fun provideApiService(retrofit: Retrofit) : ApiService {
            return retrofit.create(ApiService::class.java)
        }
    }

}