package com.cookandroid.selfpt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Start : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)

        var btn_information = findViewById<Button>(R.id.btn_information)
        var btn_athleticfield = findViewById<Button>(R.id.btn_athleticfield)

//        기본설정 버튼 세팅
        btn_information.setOnClickListener{
            val intent = Intent(this, Information::class.java)
            startActivity(intent)
        }
//        시작하기 버튼 세팅
        btn_athleticfield.setOnClickListener{
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }
    }
}