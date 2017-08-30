package com.tutorial.mim.recyclerview_header.model

import android.view.View
import kotlinx.android.synthetic.main.list_content.view.*
import kotlinx.android.synthetic.main.list_header.view.*

/**
 * Created by lf_wannabe on 27/08/2017.
 */
class ItemHolder(itemView: View) : BaseViewHolder<Item, Item>(itemView) {
    override fun onBind(item: Item?) {
        with(itemView){
            number.text = item?.num.toString()
            item_content.text = item?.content
        }
    }

    override fun onBindHeader(header: Item?) {
        itemView.header.text = header?.title
    }



}