package com.gh.dagger2demo

import android.util.Log
import javax.inject.Inject

class ZhaiNan5_1 @Inject constructor() {

    @Inject
    lateinit var baoZi: BaoZi2

    @Inject
    lateinit var noodle: KangShiFuNoodle5

    @Inject
    lateinit var resturant: String

    fun eat() {
        Log.d("ggggg", "我从${resturant}吃的是:${baoZi.toString()},${noodle.toString()}}")
    }

}