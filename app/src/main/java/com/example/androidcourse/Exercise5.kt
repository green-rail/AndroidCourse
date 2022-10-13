package com.example.androidcourse

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.content.Intent.FLAG_ACTIVITY_NEW_TASK
import android.os.Bundle
import androidx.core.content.ContextCompat.startActivity


class Exercise5 {

    fun run(){
        val intent = Intent(MainActivity.applicationContext(), Exercise5Activity::class.java)
        intent.addFlags(FLAG_ACTIVITY_NEW_TASK)
        startActivity(MainActivity.applicationContext(), intent, null)
    }
}