package com.example.myapplication

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.myapplication.databinding.FragmentMainBinding

class MainFragment:Fragment(R.layout.fragment_main) {
    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentMainBinding.bind(view)

        with(binding){
            btnMainProf.setOnClickListener {
                findNavController().navigate(R.id.action_mainFragment_to_profileFragment,
                    ProfileFragment.createBudle("Main")
                )
            }
        }

    }
//    ,
//    ProfileFragment.createBudle(
//    (etText.text ?: "Error").toString()
//    ),
//    )
//    <com.google.android.material.textfield.TextInputLayout
//    android:id="@+id/ti_text_dwn"
//    style="@style/Widget.MaterialComponents.TextInputLayout.OutlinedBox"
//    android:layout_width="match_parent"
//    android:layout_height="wrap_content"
//    android:layout_margin="16dp"
//    android:hint="ENTER TEXT HERE"
//    app:layout_constraintBottom_toBottomOf="parent"
//    app:layout_constraintEnd_toEndOf="parent"
//    app:layout_constraintStart_toStartOf="parent"
//    app:layout_constraintTop_toTopOf="parent">
//
//    <com.google.android.material.textfield.TextInputEditText
//    android:id="@+id/et_text"
//    android:layout_width="match_parent"
//    android:textSize="20dp"
//    android:textColor="@color/white"
//    android:layout_height="wrap_content"
//    android:imeOptions="actionDone" />
//    </com.google.android.material.textfield.TextInputLayout>
    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }

}