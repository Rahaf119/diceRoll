package com.example.diceroll

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val rollButton : Button = findViewById(R.id.button)
        val numberTextView : TextView = findViewById(R.id.text)

        rollButton.setOnClickListener{
            val toast= Toast.makeText( this,"dice rolled",Toast.LENGTH_SHORT)
            toast.show()
        }// end button


    }//end fun

} //end class