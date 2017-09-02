package com.wecon.mangob.floatingactionbutton

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.Toast

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var isFabOpen = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fab.setOnClickListener {
            animateFab()
        }
        fab_action_call.setOnClickListener {
            Toast.makeText(this, "Hello call", Toast.LENGTH_SHORT).show()
            animateFab()
        }
        fab_action_email.setOnClickListener {
            Toast.makeText(this, "Hello email", Toast.LENGTH_SHORT).show()
            animateFab()
        }
    }

    private fun animateFab() {
        when(isFabOpen) {
            true -> closeFab()
            false -> openFab()
        }
        isFabOpen = !isFabOpen
    }

    private fun openFab() {
        AnimationUtils.loadAnimation(applicationContext, R.anim.rotate_forward)?.let {
            fab.startAnimation(it)
        }

        AnimationUtils.loadAnimation(applicationContext, R.anim.fab_open)?.let {
            fab_action_email.startAnimation(it)
            text_fab_email.startAnimation(it)
            fab_action_call.startAnimation(it)
            text_fab_call.startAnimation(it)
        }
        fab_action_call.isClickable = true
        fab_action_email.isClickable = true
    }

    private fun closeFab() {
        AnimationUtils.loadAnimation(applicationContext, R.anim.rotate_backword)?.let {
            fab.startAnimation(it)
        }

        AnimationUtils.loadAnimation(applicationContext, R.anim.fab_close)?.let {
            fab_action_email.startAnimation(it)
            text_fab_email.startAnimation(it)
            fab_action_call.startAnimation(it)
            text_fab_call.startAnimation(it)
        }
        fab_action_call.isClickable = false
        fab_action_email.isClickable = false
    }

}
