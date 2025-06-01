package com.example.quizapplication.view

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import com.example.quizapplication.R
import com.example.quizapplication.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {

    lateinit var binding:ActivityResultBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding= DataBindingUtil.setContentView(this,R.layout.activity_result)

        binding.txtAnswer.text="Your score is : "+MainActivity.result+"/"+MainActivity.totalQuestions

        binding.btnBack.setOnClickListener(){
            var intent=Intent(this@ResultActivity,MainActivity::class.java)
            startActivity(intent)
        }
    }
}