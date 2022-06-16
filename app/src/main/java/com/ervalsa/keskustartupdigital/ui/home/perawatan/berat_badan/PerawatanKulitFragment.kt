package com.ervalsa.keskustartupdigital.ui.home.perawatan.berat_badan

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ervalsa.keskustartupdigital.R

class PerawatanKulitFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_perawatan_kulit, container, false)
    }

}