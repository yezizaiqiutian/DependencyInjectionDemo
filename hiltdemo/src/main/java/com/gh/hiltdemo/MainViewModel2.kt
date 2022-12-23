package com.gh.hiltdemo

import android.util.Log
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel2 @Inject  constructor(private val repository: Repository) : ViewModel() {

    fun net() {
        Log.d("ggggg", "MainViewModel2 net $this")
        repository.net()
    }

}