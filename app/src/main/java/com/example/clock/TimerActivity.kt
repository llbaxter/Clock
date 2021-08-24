package com.example.clock

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.widget.Toast
import com.example.clock.databinding.ActivityTimerBinding

class TimerActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTimerBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        binding = ActivityTimerBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.tvTimer.text = ""

        fun message(timeDisplayed: String){
            object : CountDownTimer(100000, 1000) {
                override fun onTick(millisUntilFinished: Long) {
                    binding.tvTimer.visibility = View.VISIBLE
                    val hour = millisUntilFinished / 3600000 % 24
                    val min = millisUntilFinished / 60000 % 60
                    val sec = millisUntilFinished / 1000 % 60
                    binding.tvTimer.text = "$hour:$min:$sec"
                }

                override fun onFinish() {
                    binding.tvTimer.visibility = View.INVISIBLE
                    binding.tvTimer.text = "00:00:00"
                }
            }.start()
        }

        binding.btnTimer.setOnClickListener {
            Toast.makeText(this, "test", Toast.LENGTH_SHORT).show()
            message("start")
        }

        }
    }