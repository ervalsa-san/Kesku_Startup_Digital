package com.ervalsa.keskustartupdigital.ui.home.apotek

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.ervalsa.keskustartupdigital.data.ApotekEntity
import com.ervalsa.keskustartupdigital.databinding.ItemApotekBinding

class ApotekAdapter : RecyclerView.Adapter<ApotekAdapter.ApotekViewHolder>() {

    private var listPharmacies = ArrayList<ApotekEntity>()

    fun setPharmacies(pharmacies: List<ApotekEntity>?) {
        if (pharmacies == null) return
        this.listPharmacies.clear()
        this.listPharmacies.addAll(pharmacies)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ApotekViewHolder {
        val itemApotekBinding = ItemApotekBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ApotekViewHolder(itemApotekBinding)
    }

    override fun onBindViewHolder(holder: ApotekViewHolder, position: Int) {
        val pharmacy = listPharmacies[position]
        holder.bind(pharmacy)
    }

    override fun getItemCount(): Int = listPharmacies.size

    class ApotekViewHolder(private val binding: ItemApotekBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(pharmacy: ApotekEntity) {
            with(binding) {
                tvTitle.text = pharmacy.title
                tvAddress.text = pharmacy.address
                ratingBar.rating = pharmacy.rating.toFloat()
                Glide.with(itemView.context)
                    .load(pharmacy.image)
                    .into(imgApotek)
            }
        }

    }
}