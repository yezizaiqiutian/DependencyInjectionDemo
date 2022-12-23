package com.gh.dagger2demo

import dagger.Module
import dagger.Provides

@Module
class ShangJiaModule3 {

    @Provides
    fun provideBaoZi2() = BaoZi2("豆沙包")

    @Provides
    fun provideNoodle3(tongYiNoodle3: TongYiNoodle3): Noodle3 {
        return tongYiNoodle3
    }

}