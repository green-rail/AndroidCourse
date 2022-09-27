package com.example.androidcourse

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {

	private lateinit var trueButton:  Button
	private lateinit var falseButton: Button
	private lateinit var nextButton:  Button

	private lateinit var questionTextView: TextView

	private val questionBank = listOf(
		Question(R.string.question_a, true),
		Question(R.string.question_b, true),
		Question(R.string.question_c, false),
		Question(R.string.question_d, false),
		Question(R.string.question_e, true)
	)

	private var currentIndex = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

		trueButton = findViewById(R.id.true_button)
		falseButton = findViewById(R.id.false_button)
		nextButton = findViewById(R.id.next_button)

		questionTextView = findViewById(R.id.question_text_view)


		trueButton.setOnClickListener{view: View ->
            Toast.makeText(
                this,
                R.string.correct_toast,
                Toast.LENGTH_SHORT).show()
		}

		falseButton.setOnClickListener{ view: View ->
           Toast.makeText(
               this,
               R.string.incorrect_toast,
               Toast.LENGTH_SHORT).show()
		}

		val questionTextResId = questionBank[currentIndex].textResId
		questionTextView.setText(questionTextResId)
        //val exercise = Exercise4()
        //exercise.run()
    }
}
