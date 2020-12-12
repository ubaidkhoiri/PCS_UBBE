package com.ubbe.app.ui.auth

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ubbe.app.R
import com.ubbe.app.data.repository.AuthRepository
import com.ubbe.app.databinding.FragmentSplashBinding

class SplashFragment : Fragment() {
    val viewModel: AuthViewModel by lazy { AuthViewModel(AuthRepository()) }
    lateinit var binding: FragmentSplashBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSplashBinding.inflate(inflater, container, false)
        binding.lifecycleOwner = this
        binding.viewModel = viewModel
        return binding.root
    }
}