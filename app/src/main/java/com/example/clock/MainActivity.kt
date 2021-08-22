package com.example.clock

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val dateNow = Calendar.getInstance().time.toString()
        val dayNow = dateNow.substring(0,3)
        val monthNow = dateNow.substring(4,7)
        val yearNow = dateNow.substring(8,10)
        val timeNow = dateNow.substring(11, 20)

        Log.d("msg", dayNow)
        Log.d("msg", monthNow)
        Log.d("msg", yearNow)
        Log.d("msg", timeNow)
    }
}