package ru.kpfu.itis.team1.android_summer_practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import ru.kpfu.itis.team1.android_summer_practice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).also {
            setContentView(it.root)
        }

        val controller =
            (supportFragmentManager.findFragmentById(R.id.host_fragment) as NavHostFragment)
                .navController

        binding?.bnvMain?.apply {
            setupWithNavController(controller)
        }
    }
}
