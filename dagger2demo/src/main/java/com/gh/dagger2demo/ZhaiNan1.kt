package com.gh.dagger2demo

import android.util.Log
import javax.inject.Inject

class ZhaiNan1 @Inject constructor() {

    @Inject
    lateinit var baoZi:BaoZi1
    @Inject
    lateinit var noodle: Noodle1

    fun eat() {
        Log.d("ggggg","我吃的是:${baoZi.toString()},${noodle.toString()}}")
    }

}