package com.example.myapplication

import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.RequestManager
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions
import com.example.myapplication.databinding.ItemSignBinding

class SignHolder (
    private val binding: ItemSignBinding,
    private val glide: RequestManager,
    private val onItemClick: (Sign) -> Unit,
) : RecyclerView.ViewHolder(binding.root) {

    private val options: RequestOptions = RequestOptions()
        .diskCacheStrategy(DiskCacheStrategy.AUTOMATIC)

    fun onBind(sign: Sign) {
        with(binding) {
            txtName.text = sign.name
            txtElem.text = sign.element
            root.setOnClickListener {
                onItemClick(sign)
//                InfoFragment.createBudle(R.id.txt_idS)
            }
            Glide.with(binding.root)
                .load(sign.url)
                .placeholder(R.drawable.goroscop)
                .error(R.drawable.goroscop)
                .into(ivCover)
        }
    }
}