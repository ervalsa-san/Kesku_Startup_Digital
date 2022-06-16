package com.ervalsa.keskustartupdigital.ui.home.perawatan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ervalsa.keskustartupdigital.R
import com.ervalsa.keskustartupdigital.databinding.ActivityPerawatanBinding

class PerawatanActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val perawatanBinding = ActivityPerawatanBinding.inflate(layoutInflater)
        setContentView(perawatanBinding.root)
    }
}