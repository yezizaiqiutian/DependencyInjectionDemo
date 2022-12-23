package com.gh.dagger2demo

import javax.inject.Inject

open class Noodle3 @Inject constructor(){

    override fun toString(): String {
        return "面条"
    }

}