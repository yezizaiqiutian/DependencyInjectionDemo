package com.gh.dagger2demo

import dagger.Component

@Component(modules = [ShangJiaModule5::class])
interface Platform5 {

    fun waimai(): ZhaiNan5

}