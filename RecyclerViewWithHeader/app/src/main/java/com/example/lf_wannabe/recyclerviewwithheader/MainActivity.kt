package com.example.lf_wannabe.recyclerviewwithheader

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.tutorial.mim.recyclerview_header.ex.ExAdapter
import com.tutorial.mim.recyclerview_header.model.Item
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var vList: ArrayList<Item> = ArrayList()
        for(i in 1..100){
            vList.add(Item(i, "TITLE", "CONTENT"))
        }

        var vAdapter: ExAdapter = ExAdapter(this, true, Item())
        with(vAdapter){
            setData(vList)
        }

        with(list){
            setHasFixedSize(false)
            adapter = vAdapter
            layoutManager = LinearLayoutManager(this@MainActivity)
        }
    }

}
