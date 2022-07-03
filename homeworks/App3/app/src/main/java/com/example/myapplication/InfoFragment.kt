package com.example.myapplication

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.myapplication.databinding.FragmentInfoBinding

class InfoFragment:Fragment(R.layout.fragment_info) {
    private var _binding: FragmentInfoBinding?= null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentInfoBinding.bind(view)

        arguments?.getString(NAME)?.also{
            binding?.txtName?.text = it
        }
        arguments?.getString(ELEM)?.also{
            binding?.txtElem?.text = it
        }
    }
    override fun onDestroyView(){
        super.onDestroyView()
        _binding = null
    }

    companion object{
        private const val NAME = "NAME"
        private const val ELEM = "ELEM"

        fun createBundle(name:String, elem:String) = Bundle().apply{

//            putString(ID, id.toString())
            putString(NAME, name)
            putString(ELEM, elem)
        }
    }

}