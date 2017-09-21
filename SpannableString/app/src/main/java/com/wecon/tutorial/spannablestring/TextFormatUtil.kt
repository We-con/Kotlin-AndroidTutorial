package com.wecon.tutorial.spannablestring

import android.text.SpannableString
import android.text.Spannable
import android.text.style.StyleSpan
import android.text.style.AbsoluteSizeSpan
import android.text.style.ForegroundColorSpan



/**
 * Created by octav on 2017-09-21.
 */
class TextFormatUtil() {

    companion object {

        fun changeColor(text: String, color: Int): SpannableString {
            var ss = SpannableString(text)
            ss.setSpan(ForegroundColorSpan(color),
                    0,
                    text.length,
                    Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
            )
            return ss
        }

        fun changeSize(text: String, dp: Int): SpannableString {
            var ss = SpannableString(text)
            ss.setSpan(AbsoluteSizeSpan(dp, true),
                    0,
                    text.length,
                    Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
            )
            return ss
        }

        fun changeStyle(text: String, flag: Int): SpannableString {
            var ss = SpannableString(text)
            when(flag) {
                0 ->  ss.setSpan(StyleSpan(android.graphics.Typeface.BOLD),
                        0,
                        text.length,
                        Spannable.SPAN_INCLUSIVE_EXCLUSIVE
                )
                1 -> ss.setSpan(StyleSpan(android.graphics.Typeface.ITALIC),
                        0,
                        text.length,
                        Spannable.SPAN_INCLUSIVE_EXCLUSIVE
                )
                2 ->  ss.setSpan(StyleSpan(android.graphics.Typeface.BOLD_ITALIC),
                        0,
                        text.length,
                        Spannable.SPAN_INCLUSIVE_EXCLUSIVE
                )
            }
            return ss
        }

    }
}