package com.example.holamundofragments

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_main_activity)
        val pideNombre = PideNombre()
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.frameLayout, pideNombre)
                .commit()
        }
    }
}