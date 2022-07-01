package com.example.myapplication

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.myapplication.databinding.FragmentFavoriteBinding
import com.example.myapplication.databinding.FragmentMainBinding

class FavoriteFragment:Fragment(R.layout.fragment_favorite) {
    private var _binding: FragmentFavoriteBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentFavoriteBinding.bind(view)

        with(binding){
            btnFavProf.setOnClickListener {
                findNavController().navigate(R.id.action_favoriteFragment_to_profileFragment,
                    ProfileFragment.createBudle("Favorite")
                )
            }
        }
    }
    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }
}