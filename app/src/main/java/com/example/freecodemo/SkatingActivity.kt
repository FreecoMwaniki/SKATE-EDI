package com.example.freecodemo

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class SkatingActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState, )
        setContentView(R.layout.activity_main)


        val button: Button =findViewById(R.id.main)
        button.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
//            intent.putExtra("key", "Welcome $nameText")
            startActivity(intent)}


        }


    }




