package com.tutorial.mangob.splashactivity

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import io.reactivex.Completable
import java.util.concurrent.TimeUnit

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Completable.timer(1000, TimeUnit.MILLISECONDS)
                .subscribe {
                    startActivity(Intent(this@SplashActivity, MainActivity::class.java))
                    finish()
                }
    }
}