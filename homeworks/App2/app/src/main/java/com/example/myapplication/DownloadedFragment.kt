package com.example.myapplication

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.myapplication.databinding.FragmentDownloadedBinding


class DownloadedFragment: Fragment(R.layout.fragment_downloaded) {
    private var _binding: FragmentDownloadedBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentDownloadedBinding.bind(view)

        with(binding){
            btnDwnProf.setOnClickListener {
                findNavController().navigate(R.id.action_downloadedFragment_to_profileFragment,
                    ProfileFragment.createBudle("Downloaded")
                )
            }
        }
    }
    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }
}