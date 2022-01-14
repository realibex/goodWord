package com.example.goodword

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import com.example.goodword.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sentenceList = mutableListOf<String>()
        sentenceList.add("검정화면에 대충 흰글씨 쓰면 명언같다.")
        sentenceList.add("검정화면에 대충 흰글씨 쓰면 명언같다2.")
        sentenceList.add("검정화면에 대충 흰글씨 쓰면 명언같다3.")
        sentenceList.add("검정화면에 대충 흰글씨 쓰면 명언같다4.")
        sentenceList.add("검정화면에 대충 흰글씨 쓰면 명언같다5.")
        sentenceList.add("검정화면에 대충 흰글씨 쓰면 명언같다6.")
        sentenceList.add("검정화면에 대충 흰글씨 쓰면 명언같다7.")
        sentenceList.add("검정화면에 대충 흰글씨 쓰면 명언같다8.")

        Log.e("MainActivity",sentenceList.random())

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.showAllSentenceBtn.setOnClickListener {
            val intent = Intent(this,SentenceAvtivity::class.java)
            startActivity(intent)
        }

        binding.goodWordTextArea.setText(sentenceList.random())
    }
}