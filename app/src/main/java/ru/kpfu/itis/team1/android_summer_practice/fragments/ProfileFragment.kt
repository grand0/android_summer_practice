package ru.kpfu.itis.team1.android_summer_practice.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import ru.kpfu.itis.team1.android_summer_practice.R
import ru.kpfu.itis.team1.android_summer_practice.databinding.FragmentProfileBinding

class ProfileFragment : Fragment(R.layout.fragment_profile) {
    private var binding: FragmentProfileBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentProfileBinding.bind(view)
        binding?.btnCheckout?.setOnClickListener {
            findNavController().navigate(
                R.id.action_profileFragment_to_checkoutFragment,
                CheckoutFragment.createBundle(javaClass.name)
            )
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}
