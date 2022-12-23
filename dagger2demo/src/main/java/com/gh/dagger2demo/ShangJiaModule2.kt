package com.gh.dagger2demo

import dagger.Module
import dagger.Provides

@Module
class ShangJiaModule2 {

    @Provides
    fun provideBaoZi() = BaoZi2("豆沙包")

    @Provides
    fun provideNoodle1() = Noodle1()

}