package com.gh.hiltdemo

import android.util.Log
import javax.inject.Inject

class ElectricEngine3 @Inject constructor() : Engine3 {
    override fun start() {
        Log.d("ggggg", "Electric engine3 start.")
    }

    override fun shutdown() {
        Log.d("ggggg", "Electric engine3 shutdown.")
    }
}
