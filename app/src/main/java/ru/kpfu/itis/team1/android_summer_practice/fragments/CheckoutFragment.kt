package ru.kpfu.itis.team1.android_summer_practice.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.google.android.material.snackbar.Snackbar
import ru.kpfu.itis.team1.android_summer_practice.R

class CheckoutFragment : Fragment(R.layout.fragment_checkout) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val className = arguments?.getString(ARG_CLASS_NAME).orEmpty()
        Snackbar.make(view, className, Snackbar.LENGTH_LONG).show()
    }

    companion object {
        private const val ARG_CLASS_NAME = "ARG_CLASS_NAME"

        fun createBundle(className: String): Bundle {
            val bundle = Bundle()
            bundle.putString(ARG_CLASS_NAME, className)
            return bundle
        }
    }
}
