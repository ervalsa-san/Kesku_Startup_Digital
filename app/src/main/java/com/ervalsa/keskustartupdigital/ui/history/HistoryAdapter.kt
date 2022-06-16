package com.ervalsa.keskustartupdigital.ui.history

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.ervalsa.keskustartupdigital.data.HistoryEntity
import com.ervalsa.keskustartupdigital.databinding.ItemHistoryBinding

class HistoryAdapter : RecyclerView.Adapter<HistoryAdapter.HistoryViewHolder>() {

    private var listHistories = ArrayList<HistoryEntity>()

    fun setHistories(histories: List<HistoryEntity>?) {
        if (histories == null) return
        this.listHistories.clear()
        this.listHistories.addAll(histories)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HistoryViewHolder {
        val itemsHistoryBinding = ItemHistoryBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return HistoryViewHolder(itemsHistoryBinding)
    }

    override fun onBindViewHolder(holder: HistoryViewHolder, position: Int) {
        val history = listHistories[position]
        holder.bind(history)
    }

    override fun getItemCount(): Int = listHistories.size

    class HistoryViewHolder(private val binding: ItemHistoryBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(history: HistoryEntity) {
            with(binding) {
                tvTitle.text = history.title
                tvItems.text = history.amountItem
                tvPrice.text = history.price
                Glide.with(itemView.context)
                    .load(history.image)
                    .into(imgHistory)
            }
        }
    }

}