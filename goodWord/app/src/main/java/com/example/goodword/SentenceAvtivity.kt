package com.example.goodword

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class SentenceAvtivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sentence)

        val listview = findViewById<ListView>(R.id.sentenceListView)

        val sentenceList = mutableListOf<String>()
        sentenceList.add("검정화면에 대충 흰글씨 쓰면 명언같다.")
        sentenceList.add("검정화면에 대충 흰글씨 쓰면 명언같다2.")
        sentenceList.add("검정화면에 대충 흰글씨 쓰면 명언같다3.")
        sentenceList.add("검정화면에 대충 흰글씨 쓰면 명언같다4.")
        sentenceList.add("검정화면에 대충 흰글씨 쓰면 명언같다5.")
        sentenceList.add("검정화면에 대충 흰글씨 쓰면 명언같다6.")
        sentenceList.add("검정화면에 대충 흰글씨 쓰면 명언같다7.")
        sentenceList.add("검정화면에 대충 흰글씨 쓰면 명언같다8.")

        val sentenceAdater = ListViewAdater(sentenceList)
        val ListView = findViewById<ListView>(R.id.sentenceListView)

        listview.adapter = sentenceAdater
    }
}