package ru.kpfu.itis.team1.android_summer_practice.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import ru.kpfu.itis.team1.android_summer_practice.R
import ru.kpfu.itis.team1.android_summer_practice.databinding.FragmentCatalogBinding

class CatalogFragment : Fragment(R.layout.fragment_catalog) {
    private var binding: FragmentCatalogBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentCatalogBinding.bind(view)
        binding?.btnCheckout?.setOnClickListener {
            findNavController().navigate(
                R.id.action_catalogFragment_to_checkoutFragment,
                CheckoutFragment.createBundle(javaClass.name)
            )
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}
