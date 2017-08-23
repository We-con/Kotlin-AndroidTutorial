package com.tutorial.mangob.gifprogress

import android.support.v7.app.AppCompatActivity

/**
 * Created by mangob on 2017. 8. 22..
 */
open class BaseActivity : AppCompatActivity() {

    fun progressON(message: String) {
        BaseApplication.instance.progressON(this, message)
    }

    fun progressOFF() {
        BaseApplication.instance.progressOFF()
    }
}