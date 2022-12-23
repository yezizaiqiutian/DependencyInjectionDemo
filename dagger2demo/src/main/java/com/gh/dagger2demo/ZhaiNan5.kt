package com.gh.dagger2demo

import android.util.Log
import javax.inject.Inject

class ZhaiNan5 @Inject constructor() {

    @Inject
    lateinit var baoZi:BaoZi2
    @Inject
    lateinit var noodle: KangShiFuNoodle5

    fun eat() {
        Log.d("ggggg","我吃的是:${baoZi.toString()},${noodle.toString()}}")
    }

}