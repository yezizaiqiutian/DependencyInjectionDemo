package com.gh.hiltdemo

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(ActivityComponent::class)
//@InstallIn(SingletonComponent::class)
class EngineModule5 {

//    @Singleton
    @Provides
    fun provideOkHttpClient():OkHttpClient5{
        return OkHttpClient5()
    }

//    @Singleton
    @Provides
    fun provideRetrofit5(okHttpClient5: OkHttpClient5):Retrofit5{
        return Retrofit5(okHttpClient5)
    }

}
