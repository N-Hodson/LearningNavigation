package com.example.learningnavigation.ui.gallery

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.learningnavigation.databinding.FragmentGalleryBinding
import com.example.learningnavigation.ui.Custom1Fragment

class GalleryFragment : Fragment() {

    private var _binding: FragmentGalleryBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {


        _binding = FragmentGalleryBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textGallery
        textView.text ="This is the GalleryFragment"

        val message = arguments?.getString(Custom1Fragment.BUNDLE_GALLERY_INFO) ?:""
        textView.text ="This is the GalleryFragment\n$message"
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}