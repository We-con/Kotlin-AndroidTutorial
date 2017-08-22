package com.tutorial.mangob.toolbar

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.view.GravityCompat
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(toolbar_main)

        toolbar_main.setNavigationOnClickListener { view ->
            if(drawer_layout.isDrawerOpen(GravityCompat.START)) {
                drawer_layout.closeDrawer(GravityCompat.START)
            } else {
                drawer_layout .openDrawer(GravityCompat.START)
            }
        }

        navigation_view.setNavigationItemSelectedListener { item ->
            when(item.itemId) {
                R.id.navigation_item_home -> goToPage("Drawer Home")
                R.id.navigation_item_shop -> goToPage("Drawer Shop")
                R.id.navigation_item_smile -> goToPage("Drawer Smile")
                R.id.navigation_item_settings_A -> goToPage("Drawer Setting A")
                R.id.navigation_item_settings_B -> goToPage("Drawer Setting B")
                else -> showMessage(item.toString())
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        toolbar_main.inflateMenu(R.menu.menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when(item?.itemId) {
            R.id.toolbar_menu_lol -> showMessage("Action LoL")
            R.id.toolbar_menu_add -> showMessage("Action Add")
            R.id.toolbar_menu_android -> showMessage("Action Android")
            R.id.toolbar_menu_settings_A -> showMessage("Action Setting A")
            R.id.toolbar_menu_settings_B -> showMessage("Action Setting B")
        }
        return super.onOptionsItemSelected(item)
    }

    private fun showMessage(msg: String): Boolean {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
        return true
    }

    private fun goToPage(msg: String): Boolean {
        showMessage(msg)
        drawer_layout.closeDrawer(GravityCompat.START)
        return true
    }
}
