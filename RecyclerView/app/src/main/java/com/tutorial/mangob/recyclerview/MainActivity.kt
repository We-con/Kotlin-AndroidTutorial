package com.tutorial.mangob.recyclerview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.tutorial.mangob.recyclerview.adpaters.UserAdapter
import com.tutorial.mangob.recyclerview.models.UserFactory
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val users = UserFactory().users

        recylcerview_users.adapter = UserAdapter(users)
        recylcerview_users.layoutManager = LinearLayoutManager(this)
    }
}
