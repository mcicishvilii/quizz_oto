package com.example.quizz_oto

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.quizz_oto.databinding.QuetionlayoutBinding

class questionFragment: Fragment(){
    private val binding get() = _binding!!
    private var _binding:QuetionlayoutBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = QuetionlayoutBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    binding.answer1.setOnClickListener {
        binding.answer1.
    }

    }
}
