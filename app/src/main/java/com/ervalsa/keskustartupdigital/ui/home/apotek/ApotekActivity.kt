package com.ervalsa.keskustartupdigital.ui.home.apotek

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.ervalsa.keskustartupdigital.databinding.ActivityApotekBinding
import com.ervalsa.keskustartupdigital.utils.DataDummy

class ApotekActivity : AppCompatActivity() {

    private lateinit var apotekBinding: ActivityApotekBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        apotekBinding = ActivityApotekBinding.inflate(layoutInflater)
        setContentView(apotekBinding.root)

        showListApotek()
    }

    fun showListApotek() {
        val pharmacies = DataDummy.generateDataApotekDummy()
        val apotekAdapter = ApotekAdapter()
        apotekAdapter.setPharmacies(pharmacies)
        with(apotekBinding.rvApotek) {
            layoutManager = GridLayoutManager(context, 2)
            setHasFixedSize(true)
            adapter = apotekAdapter
        }
    }
}