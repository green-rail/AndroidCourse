package com.example.androidcourse

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import androidx.fragment.app.FragmentTransaction

class Exercise7Activity : AppCompatActivity() {

    private lateinit var _imageButtonLeft: ImageButton
    private lateinit var _imageButtonRight: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercise7)




        findViewById<ImageButton>(R.id.exercise7ImageButtonLeft).setOnClickListener{
            buttonClick(R.drawable.scenery_large)
        }

        findViewById<ImageButton>(R.id.exercise7ImageButtonRight).setOnClickListener{
            buttonClick(R.drawable.jet_large)
        }
    }

    private fun buttonClick(imageId: Int){
        val fragment = ImageFragment()
        val bundle = Bundle()
        bundle.putInt("IMAGE_ID", imageId)
        fragment.arguments = bundle

        supportFragmentManager.beginTransaction().replace(R.id.frameLayout, fragment).commit()
    }
}