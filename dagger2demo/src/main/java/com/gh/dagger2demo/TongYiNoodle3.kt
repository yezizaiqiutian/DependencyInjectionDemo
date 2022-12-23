package com.gh.dagger2demo

import javax.inject.Inject

class TongYiNoodle3 @Inject constructor(): Noodle3() {

    override fun toString(): String {
        return "统一方便面"
    }

}