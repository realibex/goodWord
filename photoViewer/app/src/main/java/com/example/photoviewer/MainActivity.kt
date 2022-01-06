package com.example.photoviewer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bts1 = findViewById<ImageView>(R.id.bts1)
        bts1.setOnClickListener {

            Toast.makeText(this,"1번 클릭 완료", Toast.LENGTH_SHORT).show()

            var intent1 = Intent(this,Img1Activity::class.java)
            startActivity(intent1)
        }

        val bts2 = findViewById<ImageView>(R.id.bts2)
        bts2.setOnClickListener {

            Toast.makeText(this,"2번 클릭 완료", Toast.LENGTH_SHORT).show()

            var intent2 = Intent(this,Img2Activity::class.java)
            startActivity(intent2)
        }

        val bts3 = findViewById<ImageView>(R.id.bts3)
        bts3.setOnClickListener {

            Toast.makeText(this,"3번 클릭 완료", Toast.LENGTH_SHORT).show()

            var intent3 = Intent(this,Img3Activity::class.java)
            startActivity(intent3)
        }

        val bts4 = findViewById<ImageView>(R.id.bts4)
        bts4.setOnClickListener {

            Toast.makeText(this,"4번 클릭 완료", Toast.LENGTH_SHORT).show()

            var intent4 = Intent(this,Img4Activity::class.java)
            startActivity(intent4)
        }

        val bts5 = findViewById<ImageView>(R.id.bts5)
        bts5.setOnClickListener {

            Toast.makeText(this,"5번 클릭 완료", Toast.LENGTH_SHORT).show()

            var intent5 = Intent(this,Img5Activity::class.java)
            startActivity(intent5)
        }

        val bts6 = findViewById<ImageView>(R.id.bts6)
        bts6.setOnClickListener {

            Toast.makeText(this,"6번 클릭 완료", Toast.LENGTH_SHORT).show()

            var intent6 = Intent(this,Img6Activity::class.java)
            startActivity(intent6)
        }

        val bts7 = findViewById<ImageView>(R.id.bts7)
        bts7.setOnClickListener {
            Toast.makeText(this,"7번 클릭완료",Toast.LENGTH_SHORT).show()

            var intent7 = Intent(this,Img7Activity::class.java)
            startActivity(intent7)
        }

    }
}