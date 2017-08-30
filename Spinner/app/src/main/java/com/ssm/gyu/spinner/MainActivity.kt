package com.ssm.gyu.spinner

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        spinner_test.adapter = CustomAdapter(createDummy())
        spinner_test.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parentView: AdapterView<*>?) {
                text_selected.text = spinner_test.selectedItem.toString()
            }

            override fun onItemSelected(parentView: AdapterView<*>?
                                        , selectedItemView: View?, poaition: Int, id: Long) {
                text_selected.text = spinner_test.selectedItem.toString()

            }
        }
    }

    private fun createDummy(): ArrayList<String> {
        return ArrayList<String>().apply {
            add("Apple")
            add("Pear")
            add("Banana")
            add("Mellon")
            add("strawberry")
        }
    }
}
