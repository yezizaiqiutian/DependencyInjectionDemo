package com.gh.hiltdemo

import android.util.Log
import javax.inject.Inject

class GasEngine3 @Inject constructor() : Engine3 {
    override fun start() {
        Log.d("ggggg", "Gas engine3 start.")
    }

    override fun shutdown() {
        Log.d("ggggg", "Gas engine3 shutdown.")
    }
}

