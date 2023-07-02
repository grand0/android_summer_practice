package ru.kpfu.itis.team1.android_summer_practice

import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.RequestManager
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions
import ru.kpfu.itis.team1.android_summer_practice.databinding.ItemCityBinding

class CityItem(
    private val binding: ItemCityBinding,
    private val glide: RequestManager,
    private val onClick: (City) -> Unit,
) : ViewHolder(binding.root) {

    private val options: RequestOptions = RequestOptions
        .diskCacheStrategyOf(DiskCacheStrategy.ALL)

    fun onBind(city: City) {
        binding.run {
            tvTitle.text = city.name
            tvCountry.text = city.country

            glide.load(city.imageUrl)
                .placeholder(R.drawable.cat)
                .error(R.drawable.baseline_error_24)
                .apply(options)
                .into(ivImage)

            root.setOnClickListener {
                onClick(city)
            }
        }
    }
}
