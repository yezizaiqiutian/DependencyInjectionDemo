package com.gh.hiltdemo

import android.util.Log
import javax.inject.Inject

class Truck4 @Inject constructor(private val driver2: Driver2) {

    @BindGasEngine
    @Inject
    lateinit var gasEngine3: Engine3

    @BindElectricEngine
    @Inject
    lateinit var electricEngine3: Engine3

    fun deliver() {
        gasEngine3.start()
        electricEngine3.start()
        Log.d("ggggg", "Truck4 is delivering cargo. $driver2")
        gasEngine3.shutdown()
        electricEngine3.shutdown()
    }

}