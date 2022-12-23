package com.gh.dagger2demo

import dagger.Component

@Component(modules = [ShangJiaModule5_1::class])
interface Platform5_1 {

    fun waimai(): ZhaiNan5_1

}