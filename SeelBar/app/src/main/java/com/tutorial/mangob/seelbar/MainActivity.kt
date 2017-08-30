package com.tutorial.mangob.seelbar

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), SeekBar.OnSeekBarChangeListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setInitalValue(50)
        seekBar_test.setOnSeekBarChangeListener(this)
    }

    private fun setInitalValue(value: Int) {
        seekBar_test.max = 100
        seekBar_test.progress = value
        text_pogress_point.text =  "current value is $value"
        text_start_point.text = "Start point is $value"
        text_stop_point.text = "Stop point is $value"
    }

    override fun onProgressChanged(seekbar: SeekBar?, position: Int, p2: Boolean) {
        text_pogress_point.text = "current value is $position"
    }

    override fun onStartTrackingTouch(seekbar: SeekBar?) {
        text_start_point.text = "Start point is ${seekbar?.progress}"
    }

    override fun onStopTrackingTouch(seekbar: SeekBar?) {
        text_stop_point.text = "Stop point is ${seekbar?.progress}"
    }

}
