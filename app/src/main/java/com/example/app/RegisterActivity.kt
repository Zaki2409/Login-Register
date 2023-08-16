package com.example.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import android.window.SplashScreen

class RegisterActivity : AppCompatActivity() {

    private lateinit var inputEmail : EditText
    private lateinit var loginInputPassword : EditText
    private lateinit var inputphone : EditText
    private lateinit var inputPassword : EditText
    private lateinit var inputConfirmpassword : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        
        super.onCreate(savedInstanceState);


        inputEmail = findViewById(R.id.inputEmail)
        loginInputPassword = findViewById(R.id.loginInputPassword)
        inputphone = findViewById(R.id.inputphone)

        val clickme = findViewById<Button>(R.id.btnRegister);
        clickme.setOnClickListener() {
            val mail = inputEmail.text.toString().trim()
            val uid = loginInputPassword.text.toString().trim()
            val phone = inputphone.text.toString().trim()
            val  password = inputPassword.toString().trim()
            val conpass = inputConfirmpassword.toString().trim()

            if (mail.isEmpty()) {
                inputEmail.error= "Email Required"
                return@setOnClickListener
            }
            else if (uid.isEmpty()) {
                loginInputPassword.error="Username is required"
                return@setOnClickListener
            }
            else if (phone.isEmpty()){
                inputphone.error="Phone number is required"
                return@setOnClickListener

            }

            else if (password.isEmpty()) {
                inputPassword.error="password is required"
                return@setOnClickListener
            }
            else if (conpass.isEmpty()) {
                inputPassword.error="confirm password is required"
                return@setOnClickListener
            }
            else {
                Toast.makeText(this, "validation completed" , Toast.LENGTH_SHORT).show()
            }
        }


        setContentView(R.layout.activity_register)

        val btn1 = findViewById<TextView>(R.id.alreadyHaveAccount);
        btn1.setOnClickListener (View.OnClickListener{
            // Code here executes on main thread after user presses button
            val intent1 = Intent (this,LoginActivity::class.java)
            startActivity(intent1)
        })
    }
}