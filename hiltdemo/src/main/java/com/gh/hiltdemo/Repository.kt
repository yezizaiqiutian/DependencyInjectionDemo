package com.gh.hiltdemo

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

//@Singleton
class Repository @Inject constructor() {

    fun net() {
        Log.d("ggggg", "Repository net $this")
    }

}