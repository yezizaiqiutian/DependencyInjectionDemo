package com.gh.dagger2demo

import dagger.Module
import dagger.Provides

@Module
class ShangJiaModule5_1(private val restaurant : String) {

    @Provides
    fun provideBaoZi2() = BaoZi2("豆沙包")

    @Provides
    fun provideNoodle5(): KangShiFuNoodle5 {
        return KangShiFuNoodle5()
    }

    @Provides
    fun provideResturant() = restaurant

}