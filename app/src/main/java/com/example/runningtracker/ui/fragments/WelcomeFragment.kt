package com.example.runningtracker.ui.fragments

import android.content.SharedPreferences
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.runningtracker.R
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.fragment_welcome.*
import javax.inject.Inject

@AndroidEntryPoint
class WelcomeFragment : Fragment(R.layout.fragment_welcome) {

    @Inject
    lateinit var sharedPreference: SharedPreferences

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        tvContinue.setOnClickListener {
            findNavController().navigate(R.id.action_welcomeFragment_to_runFragment)
        }
    }

    private fun writePersonalDataToSharedPreference(): Boolean {
        val name = etName.text.toString()
        val weight = etWeight.text.toString()
        if(name.isEmpty() || weight.isEmpty()){
            return false
        }
        sharedPreference.edit()
            .putString()
    }

}