package com.gh.hiltdemo

import android.util.Log
import javax.inject.Inject

class Truck2 @Inject constructor(private val driver2: Driver2) {

    fun deliver() {
        Log.d("ggggg", "Truck2 is delivering cargo. $driver2")
    }

}