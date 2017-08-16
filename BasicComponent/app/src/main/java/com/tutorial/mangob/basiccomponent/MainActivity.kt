package com.tutorial.mangob.basiccomponent

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_name.setOnClickListener {
            text_my_name.text = "${edit_name.text.toString()}"
        }
    }
}
