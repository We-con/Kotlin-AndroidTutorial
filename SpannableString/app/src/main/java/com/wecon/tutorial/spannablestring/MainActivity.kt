package com.wecon.tutorial.spannablestring

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.SpannableStringBuilder
import android.text.style.ForegroundColorSpan
import android.view.Gravity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var res = SpannableStringBuilder()
        res.append(TextFormatUtil.changeColor("Change Color\n", Color.rgb(0, 0, 255)))
        res.append(TextFormatUtil.changeSize("Change Text Size\n", 20))
        res.append(TextFormatUtil.changeStyle("Bold Style\n", 0))
        res.append(TextFormatUtil.changeStyle("Italic Style\n", 1))
        res.append(TextFormatUtil.changeStyle("Bold + Italic\n", 2))

        tv.gravity = Gravity.CENTER
        tv.text = res
    }
}
