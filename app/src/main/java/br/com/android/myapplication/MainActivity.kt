package br.com.android.myapplication

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import br.com.android.myapplication.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    private lateinit var diceImage: ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val rollButton = binding.rollButton
        rollButton.setOnClickListener {
            rollDice()
        }

        diceImage = binding.diceImage

    }

    private fun rollDice() {

        val drawableResource = when (Random().nextInt(6) + 1) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

//        val diceImage: ImageView = binding.diceImage
        diceImage.setImageResource(drawableResource)


    }

}