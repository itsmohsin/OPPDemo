package com.itsmohsin.oppdemo

import android.util.Log

open class Car {
    var maxSpeed = 30
    open fun start(){
        Log.i("MyTag", "Car is Starting...")
        Log.i("MyTag", "maximum speed is $maxSpeed")
    }
}