package com.ervalsa.keskustartupdigital.ui.home.konsultasi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ervalsa.keskustartupdigital.R
import com.ervalsa.keskustartupdigital.databinding.ActivityKonsultasiBinding

class KonsultasiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val konsultasiBinding = ActivityKonsultasiBinding.inflate(layoutInflater)
        setContentView(konsultasiBinding.root)
    }
}