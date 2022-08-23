package com.itsmohsin.oppdemo

interface SpeedController {

    fun accelerate()
    fun decelerate()

    fun getBrandId():String{
        return "KA02HJ1773"
    }
}