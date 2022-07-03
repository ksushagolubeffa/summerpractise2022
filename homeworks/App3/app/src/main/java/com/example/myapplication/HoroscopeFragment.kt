package com.example.myapplication

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide
import com.example.myapplication.databinding.FragmentHoroscopeBinding

class HoroscopeFragment : Fragment(R.layout.fragment_horoscope) {
    private var _binding: FragmentHoroscopeBinding?= null
    private val binding get() = _binding!!
    private var adapter: SignAdapter? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentHoroscopeBinding.bind(view)
        adapter = SignAdapter(
            SignRepository.signs,
            Glide.with(this)
        ){ sign ->
            findNavController().navigate(R.id.action_horoscopeFragment_to_infoFragment,
                InfoFragment.createBundle(sign.name, sign.element))
        }
//        binding.txtTitle.setOnClickListener {
//            SignRepository.signs.removeAt(0)
//            adapter?.updateData(SignRepository.signs)
//        }
        binding.rvSign.adapter = adapter
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}