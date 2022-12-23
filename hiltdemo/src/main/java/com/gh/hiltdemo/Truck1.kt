package com.gh.hiltdemo

import android.util.Log
import javax.inject.Inject

class Truck1 @Inject constructor(){

    fun deliver() {
        Log.d("ggggg", "Truck1 is delivering cargo.")
    }

}