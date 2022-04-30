package com.example.quizz_oto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.quizz_oto.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flContent, questionFragment())
            addToBackStack(questionFragment::javaClass.name)
            commit()
        }
    }
}