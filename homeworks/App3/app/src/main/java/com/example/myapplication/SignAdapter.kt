package com.example.myapplication

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.RequestManager
import com.example.myapplication.databinding.ItemSignBinding

class SignAdapter(
    private var list: List<Sign>,
    private val glide: RequestManager,
    private val onItemClick: (Sign) -> Unit
) : RecyclerView.Adapter<SignHolder>() {
        override fun onCreateViewHolder(
            parent: ViewGroup,
            viewType: Int
        ): SignHolder = SignHolder(
            binding = ItemSignBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            ),
            glide = glide,
            onItemClick = onItemClick
        )

        override fun onBindViewHolder(
            holder: SignHolder,
            position: Int
        ) {
            holder.onBind(list[position])
        }

        override fun getItemCount(): Int = list.size

        fun updateData(newList: List<Sign>) {
            list = newList
            notifyDataSetChanged()
        }

}