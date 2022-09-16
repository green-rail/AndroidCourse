package com.example.androidcourse
import android.util.Log

class Exercise2 {
    fun run(){
        Log.i(null, "")
        Log.i(null, "Exercise two, alphabet")
        val characters = mutableListOf<Char>()
        for (c in 'a' .. 'z') characters += c
        for (item in characters) Log.i(null, item.toString())
        Log.i(null, "")
    }
}