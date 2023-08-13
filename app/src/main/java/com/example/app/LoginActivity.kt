package com.example.app

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity



class LoginActivity : AppCompatActivity() {

    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login2)
        val btn = findViewById<TextView>(R.id.textViewSignUp);
        btn.setOnClickListener (View.OnClickListener{
            // Code here executes on main thread after user presses button
         val intent = Intent (this,RegisterActivity::class.java)
              startActivity(intent)
        })

    }
}