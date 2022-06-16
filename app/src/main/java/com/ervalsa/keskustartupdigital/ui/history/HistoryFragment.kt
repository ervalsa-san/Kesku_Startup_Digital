package com.ervalsa.keskustartupdigital.ui.history

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.ervalsa.keskustartupdigital.R
import com.ervalsa.keskustartupdigital.databinding.FragmentHistoryBinding
import com.ervalsa.keskustartupdigital.utils.DataDummy

class HistoryFragment : Fragment() {

    private lateinit var fragmentHistoryBinding: FragmentHistoryBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        fragmentHistoryBinding = FragmentHistoryBinding.inflate(layoutInflater, container, false)
        return fragmentHistoryBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (activity != null) {
            val histories = DataDummy.generateDataHistoryDummy()
            val historyAdapter = HistoryAdapter()
            historyAdapter.setHistories(histories)

            with(fragmentHistoryBinding.rvHistory) {
                layoutManager = LinearLayoutManager(context)
                setHasFixedSize(true)
                adapter = historyAdapter
            }
        }
    }

}