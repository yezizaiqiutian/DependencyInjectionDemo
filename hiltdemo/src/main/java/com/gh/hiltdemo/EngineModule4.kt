package com.gh.hiltdemo

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import javax.inject.Qualifier

@Module
@InstallIn(ActivityComponent::class)
abstract class EngineModule4 {

    @BindGasEngine
    @Binds
    abstract fun bindGasEngine(gasEngine4: GasEngine3):Engine3

    @BindElectricEngine
    @Binds
    abstract fun bindElectricEngine(gasEngine4: ElectricEngine3):Engine3

}

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class BindGasEngine

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class BindElectricEngine

