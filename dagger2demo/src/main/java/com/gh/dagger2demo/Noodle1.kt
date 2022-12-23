package com.gh.dagger2demo

import javax.inject.Inject

class Noodle1 @Inject constructor(){

    override fun toString(): String {
        return "炸酱面"
    }

}