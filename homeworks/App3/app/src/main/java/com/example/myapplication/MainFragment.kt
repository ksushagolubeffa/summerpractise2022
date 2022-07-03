package com.example.myapplication

import android.content.Context
import android.os.Bundle
import android.provider.Settings.Global.putString
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.myapplication.databinding.FragmentMainBinding

class MainFragment: Fragment(R.layout.fragment_main) {
    private var _binding: FragmentMainBinding?= null
    private val binding get() = _binding!!
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentMainBinding.bind(view)

        with(binding){
            btnMain.setOnClickListener {
                findNavController().navigate(R.id.action_mainFragment2_to_horoscopeFragment)
            }
        }
    }
    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }
}