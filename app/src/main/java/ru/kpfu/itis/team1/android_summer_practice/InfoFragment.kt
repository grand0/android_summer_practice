package ru.kpfu.itis.team1.android_summer_practice

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions
import ru.kpfu.itis.team1.android_summer_practice.databinding.FragmentInfoBinding

class InfoFragment : Fragment(R.layout.fragment_info) {
    private var binding: FragmentInfoBinding? = null

    private val options: RequestOptions = RequestOptions
        .diskCacheStrategyOf(DiskCacheStrategy.ALL)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentInfoBinding.bind(view)

        val cityId = arguments?.getInt(ARG_ID)
        val city = CityRepository.getById(cityId)
        if (city != null) {
            binding?.run {
                tvName.text = city.name
                tvCountry.text = city.country
                tvPopulation.text = "${city.population}"
                tvArea.text = "${city.area} km²"
                tvId.text = "${city.id}"
                tvDesc.text = city.description
                Glide.with(view)
                    .load(city.imageUrl)
                    .placeholder(R.drawable.cat)
                    .error(R.drawable.baseline_error_24)
                    .apply(options)
                    .into(ivImage)
                btnBack.setOnClickListener {
                    findNavController().popBackStack()
                }
            }
        }
    }

    companion object {
        private const val ARG_ID = "ARG_ID"

        fun createBundle(cityId: Int): Bundle {
            val bundle = Bundle()
            bundle.putInt(ARG_ID, cityId)
            return bundle
        }
    }
}
