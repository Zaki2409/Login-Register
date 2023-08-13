package com.example.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.window.SplashScreen

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);


            setContentView(R.layout.activity_register)

        val btn1 = findViewById<TextView>(R.id.alreadyHaveAccount);
        btn1.setOnClickListener (View.OnClickListener{
            // Code here executes on main thread after user presses button
            val intent1 = Intent (this,LoginActivity::class.java)
            startActivity(intent1)
        })
    }
}