package com.example.androidcourse

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {


	init {
		instance = this
	}

	companion object {
		private var instance: MainActivity? = null

		fun applicationContext() : Context {
			return instance!!.applicationContext
		}
	}




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

		//Задания 1-6 работают
		//val exercise = Exercise5()
		val exercise = Exercise6()
        exercise.run()
    }
}
