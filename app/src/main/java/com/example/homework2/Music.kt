package com.example.homework2

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.homework2.R
import com.example.homework2.databinding.MusicMainBinding
import com.example.homework2.hw3.Song
import com.example.homework2.hw3.SongAdapter
import com.example.homework2.hw3.SongRepository
import com.google.android.material.snackbar.Snackbar

class Music : Fragment(R.layout.music_main) {
    private var _binding: MusicMainBinding? = null
    private val binding get() = _binding!!

    private var adapter: SongAdapter? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = MusicMainBinding.bind(view)

        adapter = SongAdapter(SongRepository.songs, {
            Snackbar.make(
                binding.root,
                "Song id: ${it.id}",
                Snackbar.LENGTH_LONG
            ).show()
        })
        binding.rvMusic.adapter = adapter
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}