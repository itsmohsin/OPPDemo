package com.itsmohsin.oppdemo

import android.util.Log

class Driver(var name : String) {
//    var driverName = ""
//    lateinit var driverName : String
//    var driverName = name
    val car = Car()


    init {
//        driverName = name
        car.maxSpeed =150
        car.start()
    }

    fun showDetails(){
//        Log.i("MyTag", "name of the driver is $driverName")
        Log.i("MyTag", "name of the driver is $name")
    }
}