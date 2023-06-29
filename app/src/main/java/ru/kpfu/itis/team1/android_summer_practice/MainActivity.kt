package ru.kpfu.itis.team1.android_summer_practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioGroup
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var nameEditText: EditText
    private lateinit var heightEditText: EditText
    private lateinit var weightEditText: EditText
    private lateinit var ageEditText: EditText
    private lateinit var genderRadioGroup: RadioGroup
    private lateinit var resultTextView: TextView
    private lateinit var calculateButton: Button
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        nameEditText = findViewById(R.id.name_edit_text)
        heightEditText = findViewById(R.id.height_edit_text)
        weightEditText = findViewById(R.id.weight_edit_text)
        ageEditText = findViewById(R.id.age_edit_text)
        genderRadioGroup = findViewById(R.id.gender_radio_group)
        resultTextView = findViewById(R.id.result_text_view)
        calculateButton = findViewById(R.id.calculate_button)

        calculateButton.setOnClickListener {
            calculate()
        }
    }

    private fun calculate() {
        val name = nameEditText.text.toString()
        val height = heightEditText.text.toString().toIntOrNull()
        val weight = weightEditText.text.toString().toDoubleOrNull()
        val age = ageEditText.text.toString().toIntOrNull()
        val isMale = genderRadioGroup.checkedRadioButtonId == R.id.male_radio_button

        if (name.length in 1..50
            && height != null && height in 1..250
            && weight != null && weight > 0.0 && weight <= 250.0
            && age != null && age in 0..150) {
            val idealWeight = when {
                age == 0 -> 4.0
                age <= 10 -> 2.0 * age + 10
                isMale -> 50 + 0.9 * (height - 152)
                else -> 45.5 + 0.9 * (height - 152)
            }
            val sb = StringBuilder("Your ideal weight is $idealWeight. ")
            val diff = idealWeight - weight
            if (diff > 8) sb.append("You're underweight.")
            else if (diff > 3) sb.append("You're slightly underweight.")
            else if (diff < -8) sb.append("You're overweight.")
            else if (diff < -3) sb.append("You're slightly overweight.")
            else sb.append("Your weight is fine.")
            resultTextView.text = sb.toString()
        } else {
            resultTextView.text = "Please enter correct data."
        }
    }
}