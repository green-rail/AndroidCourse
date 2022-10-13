package com.example.androidcourse

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class Exercise5Activity : AppCompatActivity() {

    private val _tag = "Exercise5"

    private val _poetryPiece: List<String> = listOf(
        "Three Rings for the Elven-kings under the sky,",
        "Seven for the Dwarf-lords in their halls of stone,",
        "Nine for Mortal Men doomed to die,",
        "One for the Dark Lord on his dark throne",
        "In the Land of Mordor where the Shadows lie.",
        "One Ring to rule them all, One Ring to find them,",
        "One Ring to bring them all and in the darkness bind them."
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercise5)

        logPoetryPart(0)
    }
    override fun onStart(){
        super.onStart()
        logPoetryPart(1)
    }

    override fun onRestart(){
        super.onRestart()
        logPoetryPart(2)
    }

    override fun onResume(){
        super.onResume()
        logPoetryPart(3)
    }

    override fun onPause(){
        super.onPause()
        logPoetryPart(4)
    }


    override fun onStop(){
        super.onStop()
        logPoetryPart(5)
    }

    override fun onDestroy(){
        super.onDestroy()
        logPoetryPart(6)
    }

    private fun logPoetryPart(index: Int){
        Log.i(_tag, _poetryPiece[index])
    }

}