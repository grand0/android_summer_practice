package ru.kpfu.itis.team1.android_summer_practice.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import ru.kpfu.itis.team1.android_summer_practice.R
import ru.kpfu.itis.team1.android_summer_practice.databinding.FragmentCartBinding

class CartFragment : Fragment(R.layout.fragment_cart) {
    private var binding: FragmentCartBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentCartBinding.bind(view)
        binding?.btnCheckout?.setOnClickListener {
            findNavController().navigate(
                R.id.action_cartFragment_to_checkoutFragment,
                CheckoutFragment.createBundle(javaClass.name)
            )
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}
