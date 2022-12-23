package com.gh.dagger2demo

import dagger.Component

@Component(modules = [ShangJiaModule2::class])
interface Platform2 {

    fun waimai(): ZhaiNan2

}