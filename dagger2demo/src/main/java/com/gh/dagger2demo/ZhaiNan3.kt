package com.gh.dagger2demo

import android.util.Log
import javax.inject.Inject

class ZhaiNan3 @Inject constructor() {

    @Inject
    lateinit var baoZi:BaoZi2
    @Inject
    lateinit var noodle: Noodle3

    fun eat() {
        Log.d("ggggg","我吃的是:${baoZi.toString()},${noodle.toString()}}")
    }

}