package com.itsmohsin.oppdemo

import android.util.Log

class MyCar : Car(), SpeedController {
    override fun start() {
        Log.i("MyTag","this is MyCar Starting...Brand id is ${getBrandId()}")
    }

    override fun accelerate() {
    }

    override fun decelerate() {
    }
}