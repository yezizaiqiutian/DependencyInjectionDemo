package com.gh.hiltdemo

import android.util.Log
import javax.inject.Inject

class Truck3 @Inject constructor(private val driver2: Driver2) {

    @Inject
    lateinit var engine3: Engine3

    fun deliver() {
        engine3.start()
        Log.d("ggggg", "Truck3 is delivering cargo. $driver2")
        engine3.shutdown()
    }

}