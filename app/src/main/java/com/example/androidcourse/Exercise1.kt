package com.example.androidcourse
import android.util.Log

class Exercise1 {
    fun run(){
        Log.i(null, "")
        Log.i(null, "Exercise one, parallelepiped volume")
        //Sides sizes and height:
        val a = 5f
        val b = 6f
        val h = 10f
        Log.i(null, "Parallelepiped: a = $a, b = $b, h = $h")
        Log.i(null, "Volume = ${parallelepipedVolume(a, b, h)}")
        Log.i(null, "")
    }
    private fun parallelepipedVolume(sideA : Float, sideB : Float, height : Float) : Float{
        return  sideA * sideB * height
    }
}