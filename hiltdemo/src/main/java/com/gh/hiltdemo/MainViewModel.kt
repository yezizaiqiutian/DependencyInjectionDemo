package com.gh.hiltdemo

import android.util.Log
import androidx.lifecycle.ViewModel
import dagger.hilt.android.scopes.ActivityRetainedScoped
import javax.inject.Inject

@ActivityRetainedScoped
class MainViewModel @Inject constructor(private val repository: Repository) : ViewModel() {

    fun net() {
        Log.d("ggggg", "MainViewModel net $this")
        repository.net()
    }

}