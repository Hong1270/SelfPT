package com.cookandroid.selfpt

import android.content.Intent
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.SpannableStringBuilder
import android.text.Spanned
import android.text.style.StyleSpan
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    //var textView1: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var textView1 = findViewById<TextView>(R.id.textView1) //TextView 참조
        var btn_setting = findViewById<Button>(R.id.btn_setting)
        var btn_start = findViewById<Button>(R.id.btn_start)

//        Text 설정
        val textView1_Data: String = textView1.text.toString() //String 문자열 데이터 취득
        val textView1_builder = SpannableStringBuilder(textView1_Data) //SpannableStringBuilder 타입으로 변환
        //해당 인덱스에 해당하는 문자열에 볼드체 적용
        val boldSpan = StyleSpan(Typeface.BOLD)
        //var startIndex = textView1.text.toString().indexOf("Self PT") //Self PT로 시작하는 인덱스 구하기
        textView1_builder.setSpan(boldSpan, 10, textView1_Data.length, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE) //10번 인덱스 = Self PT 시작
        textView1.text = textView1_builder //TextView1에 적용

//        기본설정 버튼 세팅
        btn_setting.setOnClickListener{
            val intent = Intent(this, BasicSetting::class.java)
            startActivity(intent)
        }
//        시작하기 버튼 세팅
        btn_start.setOnClickListener{
            val intent = Intent(this, Start::class.java)
            startActivity(intent)
        }
    }
}