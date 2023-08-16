package com.example.app

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity



class LoginActivity : AppCompatActivity() {


    private lateinit var inputEmail : EditText
    private lateinit var loginInputPassword : EditText
    private lateinit var inputphone : EditText

    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login2)
        inputEmail = findViewById(R.id.inputEmail)
        loginInputPassword = findViewById(R.id.loginInputPassword)
        inputphone = findViewById(R.id.inputphone)

        val clickme = findViewById<Button>(R.id.btnlogin);
        clickme.setOnClickListener() {
            val mail = inputEmail.text.toString().trim()
            val uid = loginInputPassword.text.toString().trim()
            val phone = inputphone.text.toString().trim()

            if (mail.isEmpty()) {
                inputEmail.error= "Email Required"
                return@setOnClickListener
            }
            else if (uid.isEmpty()) {
                loginInputPassword.error="username is required"
                return@setOnClickListener
            }
            else if (phone.isEmpty()){
                inputphone.error="Phone number is required"
                return@setOnClickListener
            }else {
                Toast.makeText(this, "validation completed" , Toast.LENGTH_SHORT).show()
            }
        }


        val btn = findViewById<TextView>(R.id.textViewSignUp);
        btn.setOnClickListener (View.OnClickListener{
            // Code here executes on main thread after user presses button
         val intent = Intent (this,RegisterActivity::class.java)
              startActivity(intent)
        })

    }
}