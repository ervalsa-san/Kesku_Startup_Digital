package com.ervalsa.keskustartupdigital.ui.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ervalsa.keskustartupdigital.MainActivity
import com.ervalsa.keskustartupdigital.R
import com.ervalsa.keskustartupdigital.databinding.ActivityLoginBinding
import com.ervalsa.keskustartupdigital.ui.sign_up.SignUpActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val loginBinding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(loginBinding.root)

        loginBinding.txtSignUp.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
            finish()
        }

        loginBinding.btnLogin.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}