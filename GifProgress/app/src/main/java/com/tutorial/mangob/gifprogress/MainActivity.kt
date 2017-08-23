package com.tutorial.mangob.gifprogress

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_loading.setOnClickListener {
            progressON("Loading..")
            Handler().postDelayed(Runnable { progressOFF() }, 3500)
        }
    }

}
