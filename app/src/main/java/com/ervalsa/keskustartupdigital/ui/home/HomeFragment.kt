package com.ervalsa.keskustartupdigital.ui.home

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.ervalsa.keskustartupdigital.R
import com.ervalsa.keskustartupdigital.databinding.ContentLayananKhususBinding
import com.ervalsa.keskustartupdigital.databinding.FragmentHomeBinding
import com.ervalsa.keskustartupdigital.ui.home.apotek.ApotekActivity
import com.ervalsa.keskustartupdigital.ui.home.konsultasi.KonsultasiActivity
import com.ervalsa.keskustartupdigital.ui.home.obat.ObatActivity
import com.ervalsa.keskustartupdigital.ui.home.perawatan.PerawatanActivity

class HomeFragment : Fragment() {

    private lateinit var homeFragmentBinding: FragmentHomeBinding
    private lateinit var contentLayananKhususBinding: ContentLayananKhususBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        homeFragmentBinding = FragmentHomeBinding.inflate(inflater, container, false)
        contentLayananKhususBinding = homeFragmentBinding.contentLayananKhusus
        return homeFragmentBinding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        contentLayananKhususBinding.cardApotek.setOnClickListener {
            val intent = Intent(context, ApotekActivity::class.java)
            startActivity(intent)
        }

        contentLayananKhususBinding.cardKonsultasi.setOnClickListener {
            val intent = Intent(context, KonsultasiActivity::class.java)
            startActivity(intent)
        }

        contentLayananKhususBinding.cardObat.setOnClickListener {
            val intent = Intent(context, ObatActivity::class.java)
            startActivity(intent)
        }

        contentLayananKhususBinding.cardPerawatan.setOnClickListener {
            val intent = Intent(context, PerawatanActivity::class.java)
            startActivity(intent)
        }

        Glide.with(this)
            .load(R.drawable.dummy_photo)
            .circleCrop()
            .into(homeFragmentBinding.imgUserPhoto)
    }

}