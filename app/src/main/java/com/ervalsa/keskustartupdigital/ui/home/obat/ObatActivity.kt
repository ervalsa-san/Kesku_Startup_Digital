package com.ervalsa.keskustartupdigital.ui.home.obat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.ervalsa.keskustartupdigital.R
import com.ervalsa.keskustartupdigital.databinding.ActivityObatBinding
import com.ervalsa.keskustartupdigital.utils.DataDummy

class ObatActivity : AppCompatActivity() {

    private lateinit var obatBinding: ActivityObatBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        obatBinding = ActivityObatBinding.inflate(layoutInflater)
        setContentView(obatBinding.root)

        showListObat()
    }

    fun showListObat() {
        val obat = DataDummy.generateDataObatDummy()
        val obatAdapter = ObatAdapter()
        obatAdapter.setObat(obat)
        with(obatBinding.rvObat) {
            layoutManager = GridLayoutManager(context, 2)
            setHasFixedSize(true)
            adapter = obatAdapter
        }
    }
}