package com.example.homework2.hw3

import androidx.recyclerview.widget.RecyclerView
import com.example.homework2.databinding.ItemSongBinding

class SongHolder(
    private val binding: ItemSongBinding,
    private val onItemClick:(Song) -> Unit,
): RecyclerView.ViewHolder(binding.root) {

    fun onBind(song: Song){
        with(binding){
            tvName.text = song.name
            tvAuthor.text = song.author
            root.setOnClickListener{
                onItemClick(song)
            }
        }
    }
}