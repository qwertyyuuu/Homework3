package com.example.homework2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import com.example.homework2.databinding.MessageMainBinding
import com.example.homework2.databinding.NotesMainBinding

class Notes : Fragment(R.layout.notes_main) {
    private var _binding: NotesMainBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = NotesMainBinding.bind(view)
    }

}