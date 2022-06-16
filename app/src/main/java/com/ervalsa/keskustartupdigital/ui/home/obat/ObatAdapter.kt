package com.ervalsa.keskustartupdigital.ui.home.obat

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.ervalsa.keskustartupdigital.data.ObatEntity
import com.ervalsa.keskustartupdigital.databinding.ItemObatBinding

class ObatAdapter : RecyclerView.Adapter<ObatAdapter.ObatViewHolder>(){

    private var listObat = ArrayList<ObatEntity>()

    fun setObat(obat: List<ObatEntity>?) {
        if (obat == null) return
        this.listObat.clear()
        this.listObat.addAll(obat)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ObatViewHolder {
        val itemObatAdapter = ItemObatBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ObatViewHolder(itemObatAdapter)
    }

    override fun onBindViewHolder(holder: ObatViewHolder, position: Int) {
        val obat = listObat[position]
        holder.bind(obat)
    }

    override fun getItemCount(): Int = listObat.size

    class ObatViewHolder(private val binding: ItemObatBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(obat: ObatEntity) {
            with(binding) {
                tvTitle.text = obat.title
                tvPrice.text = obat.price
                Glide.with(itemView.context)
                    .load(obat.image)
                    .into(imgObat)

                itemView.setOnClickListener {
                    val intent = Intent(itemView.context, ObatDetailActivity::class.java)
                    intent.putExtra(ObatDetailActivity.EXTRA_DATA, obat.obatId)
                    itemView.context.startActivity(intent)
                }
            }
        }
    }
}