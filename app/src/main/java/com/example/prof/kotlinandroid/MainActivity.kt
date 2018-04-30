package com.example.prof.kotlinandroid

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk25.coroutines.onClick

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        verticalLayout{
            val textField = editText{
                hint = "Enter Name For Button to Change"
            }
            val buttonChange = button("Default")
            button("Get "){
                onClick {
                    buttonChange.text = if(textField.text.isBlank()) "Back to My Default" else textField.text
                }
            }
            button("Select State"){
                onClick {
                    val states = listOf("Nigeria","Abuja","Sokoto")
                    selector("Select Your State",states){ dialogInterface, i ->  
                        toast("Oh You are from ${states[i]}")
                    }
                }
            }

        }
    }
}
