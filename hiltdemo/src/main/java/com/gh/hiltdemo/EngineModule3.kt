package com.gh.hiltdemo

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
abstract class EngineModule3 {

    @Binds
    abstract fun bindEngine(gasEngine3: GasEngine3):Engine3

}