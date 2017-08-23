package com.tutorial.mangob.popupactivity

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v4.app.AppOpsManagerCompat
import android.support.v7.app.AppCompatActivity

/**
 * Created by mangob on 2017. 8. 23..
 */
class PopupActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_popup)
    }
}