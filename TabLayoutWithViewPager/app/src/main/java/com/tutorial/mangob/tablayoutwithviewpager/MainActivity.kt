package com.tutorial.mangob.tablayoutwithviewpager

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.tutorial.mangob.tablayoutwithviewpager.Adapter.PageAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(toolbar_main)
        viewpager_main!!.adapter = PageAdapter(supportFragmentManager)
        tablayout_main.setupWithViewPager(viewpager_main)
    }
}
