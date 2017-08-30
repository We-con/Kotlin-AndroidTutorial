package com.ssm.gyu.spinner

import android.support.constraint.ConstraintLayout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.SpinnerAdapter
import kotlinx.android.synthetic.main.item_spinner.view.*

/**
 * Created by mangob on 2017. 8. 31..
 */
class CustomAdapter(var list: ArrayList<String>) : BaseAdapter(), SpinnerAdapter {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var userItem = LayoutInflater.from(parent?.context)
                .inflate(R.layout.item_spinner, parent, false) as ConstraintLayout
        with(userItem) {
            text_category.text = list[position]
        }
        return userItem
    }

    override fun getItem(position: Int) = list[position]

    override fun getItemId(position: Int) = position.toLong()

    override fun getCount(): Int = list.size
}