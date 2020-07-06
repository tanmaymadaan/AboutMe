package com.tanmaymadaan.aboutme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    private fun addNickname(view: View) {
        val editText = findViewById<EditText>(R.id.nickname_edit)
        val nickNameTextView = findViewById<TextView>(R.id.nickname_text)

        nickNameTextView.text = editText.text
        editText.visibility = View.GONE
        view.visibility = View.GONE
        nickNameTextView.visibility = View.VISIBLE
    }
}