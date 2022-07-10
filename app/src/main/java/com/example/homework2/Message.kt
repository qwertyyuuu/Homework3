package com.example.homework2

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.homework2.databinding.MessageMainBinding

class Message : Fragment(R.layout.message_main) {
    private var _binding: MessageMainBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = MessageMainBinding.bind(view)
    }
    }



