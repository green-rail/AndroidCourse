package com.example.androidcourse
import android.util.Log
import kotlin.reflect.typeOf

class Exercise4 {

    fun run(){
        Log.i(null, "")
        Log.i(null, "Exercise four, OOP")
        val animals = mutableListOf<Animal>()

        animals.add(Herbivore("Giraffe"))
        animals.add(Herbivore("Antelope"))
        animals.add(Predator("Wolf"))
        animals.add(Predator("Crocodile", false));

        for (animal in animals){

            val fur = if (animal.hasFur) "has fur" else "doesn't have fur"
            Log.i(null, "This is a(an) ${animal.name} of type ${animal::class.simpleName} it $fur and its tastes are: ${animal.askTastePreference()}")
        }
        Log.i(null, "")

    }


    abstract class Animal(val name: String, val hasFur: Boolean = true){

        abstract fun askTastePreference() : String
    }

    class Herbivore(name: String, hasFur: Boolean = true) : Animal(name, hasFur){
        override fun askTastePreference(): String {
            return "I only eat grass and vegetables"
        }

    }

    class Predator(name: String, hasFur: Boolean = true) : Animal(name, hasFur){
        override fun askTastePreference(): String {
            return "I prefer meat"
        }
    }
}