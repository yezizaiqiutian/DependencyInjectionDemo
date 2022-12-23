package com.gh.hiltdemo

import android.app.Application
import android.content.Context
import android.util.Log
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

/**
 * 假装自己是个第三方的类
 * 不能增加任何的注解
 */
class Retrofit8 @Inject constructor(
    @ApplicationContext val context: Context,
    val application: Application,
    private val okHttpClient8: OkHttpClient8
) {

    fun net() {
        Log.d("ggggg", "Retrofit8 net $this  ----- $context  ----- $application")
        okHttpClient8.net()
    }

}