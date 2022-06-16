package com.ervalsa.keskustartupdigital.ui.home.obat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.ervalsa.keskustartupdigital.R
import com.ervalsa.keskustartupdigital.data.ObatEntity
import com.ervalsa.keskustartupdigital.databinding.ActivityObatDetailBinding
import com.ervalsa.keskustartupdigital.ui.pembayaran.PembayaranActivity
import com.ervalsa.keskustartupdigital.utils.DataDummy

class ObatDetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_DATA = "extra_data"
    }

    private lateinit var obatDetailBinding: ActivityObatDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        obatDetailBinding = ActivityObatDetailBinding.inflate(layoutInflater)
        setContentView(obatDetailBinding.root)

        val extras = intent.extras
        if (extras != null) {
            val obatId = extras.getString(EXTRA_DATA)
            if (obatId != null) {
                for (obat in DataDummy.generateDataObatDummy()) {
                    if (obat.obatId == obatId) {
                        populateObat(obat)
                    }
                }
            }
        }

        obatDetailBinding.btnBeli.setOnClickListener {
            val intent = Intent(this, PembayaranActivity::class.java)
            startActivity(intent)
        }
    }

    fun populateObat(obatEntity: ObatEntity) {
        obatDetailBinding.tvTitle.text = obatEntity.title
        obatDetailBinding.tvDeskripsi.text = obatEntity.description

        Glide.with(this)
            .load(obatEntity.image)
            .into(obatDetailBinding.imgPhoto)
    }
}