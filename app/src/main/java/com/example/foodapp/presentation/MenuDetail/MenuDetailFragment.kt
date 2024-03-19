package com.example.foodapp.presentation.MenuDetail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.foodapp.R
import com.example.foodapp.databinding.FragmentMenuDetailBinding
import com.example.foodapp.databinding.FragmentMenuListBinding


class MenuDetailFragment : Fragment() {

    private lateinit var binding : FragmentMenuDetailBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentMenuDetailBinding.inflate(layoutInflater,container,false)
        return binding.root
    }
}