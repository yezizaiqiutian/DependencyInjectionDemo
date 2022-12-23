package com.gh.dagger2demo

import dagger.Component

@Component(modules = [ShangJiaModule3::class])
interface Platform3 {

    fun waimai(): ZhaiNan3

}