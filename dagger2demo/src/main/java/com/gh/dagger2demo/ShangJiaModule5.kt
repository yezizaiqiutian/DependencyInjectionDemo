package com.gh.dagger2demo

import dagger.Module
import dagger.Provides

@Module
class ShangJiaModule5 {

    @Provides
    fun provideBaoZi2() = BaoZi2("豆沙包")

    @Provides
    fun provideNoodle5(): KangShiFuNoodle5 {
        return KangShiFuNoodle5()
    }

}