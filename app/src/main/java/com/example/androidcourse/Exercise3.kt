package com.example.androidcourse
import android.util.Log

class Exercise3 {
    fun run(){
        Log.i(null, "")
        Log.i(null, "Exercise tree, list")
        val numbers = mutableListOf<Int>()
        for(i in 1..10){
            numbers += i
        }
        logCollection(numbers)
    }

    private fun logCollection(inputList: List<Int>){
        for(item in inputList) Log.i(null, item.toString())
    }
}