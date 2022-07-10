package com.example.homework2
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.homework2.databinding.SettingsMainBinding

class Settings : Fragment(R.layout.settings_main){
    private var _binding: SettingsMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = SettingsMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = SettingsMainBinding.bind(view)

        with(binding){
            btnMusic.setOnClickListener{
                val bundle = Bundle()
                findNavController().navigate(R.id.action_settings2_to_music)
                R.id.action_settings2_to_music
                bundle
            }

            btnGallery.setOnClickListener{
                findNavController().navigate(R.id.action_settings2_to_gallery)
            }

            btnMessage.setOnClickListener{
                findNavController().navigate(R.id.action_settings2_to_message3)
            }

            btnNotes.setOnClickListener{
                findNavController().navigate(R.id.action_settings2_to_notes)
            }

        }
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }
}