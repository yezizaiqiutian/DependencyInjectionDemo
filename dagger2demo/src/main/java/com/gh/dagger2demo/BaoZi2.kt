package com.gh.dagger2demo

import javax.inject.Inject

class BaoZi2 @Inject constructor(val name: String) {

    override fun toString(): String {
        return name
    }

}