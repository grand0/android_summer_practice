package ru.kpfu.itis.team1.android_summer_practice

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide
import ru.kpfu.itis.team1.android_summer_practice.databinding.FragmentMainBinding

class MainFragment : Fragment(R.layout.fragment_main) {
    private var binding: FragmentMainBinding? = null
    private var adapter: CityAdapter? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMainBinding.bind(view)

        initAdapter()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

    private fun initAdapter() {
        adapter = CityAdapter(
            CityRepository.list,
            Glide.with(this),
            onClick = { city ->
                findNavController().navigate(
                    R.id.action_mainFragment_to_infoFragment,
                    InfoFragment.createBundle(city.id)
                )
            }
        )
        binding?.rvCities?.adapter = adapter
    }
}
