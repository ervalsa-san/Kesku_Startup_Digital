package com.ervalsa.keskustartupdigital.ui.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.ervalsa.keskustartupdigital.MainActivity
import com.ervalsa.keskustartupdigital.databinding.ActivitySplashScreenBinding
import com.ervalsa.keskustartupdigital.ui.login.LoginActivity
import com.ervalsa.keskustartupdigital.ui.sign_up.SignUpActivity

class SplashActivity : AppCompatActivity() {

    companion object {
        val timer = 2000L
    }

    lateinit var handler: Handler

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val splashBinding = ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView(splashBinding.root)

        handler = Handler()
        handler.postDelayed({
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }, timer)
    }
}