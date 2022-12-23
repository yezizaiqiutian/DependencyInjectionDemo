package com.gh.hiltdemo

import android.util.Log

/**
 * 假装自己是个第三方的类
 * 不能增加任何的注解
 */
class Retrofit5(private val okHttpClient5: OkHttpClient5) {

    fun net() {
        Log.d("ggggg", "Retrofit5 net $okHttpClient5")
        okHttpClient5.net()
    }

}