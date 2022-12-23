package com.gh.hiltdemo

import android.app.Activity
import android.app.Application
import android.content.Context
import android.util.Log
import dagger.hilt.android.qualifiers.ActivityContext
import javax.inject.Inject

/**
 * 假装自己是个第三方的类
 * 不能增加任何的注解
 */
class OkHttpClient8 @Inject constructor(
    @ActivityContext val context: Context,
    private val activity: Activity
) {

    fun net() {
        Log.d("ggggg", "OkHttpClient8 net $this  ----- $context  ----- $activity")
    }

}