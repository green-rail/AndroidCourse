package com.example.androidcourse

import android.content.Intent
import androidx.core.content.ContextCompat

class Exercise7 {
    fun run(){

        val intent = Intent(MainActivity.applicationContext(), Exercise7Activity::class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        ContextCompat.startActivity(MainActivity.applicationContext(), intent, null)

    }
}