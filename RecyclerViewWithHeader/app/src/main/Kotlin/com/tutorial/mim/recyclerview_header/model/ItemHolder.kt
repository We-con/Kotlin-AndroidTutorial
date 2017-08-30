package com.tutorial.mim.recyclerview_header.model

import android.content.Context
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.list_content.view.*

/**
 * Created by lf_wannabe on 27/08/2017.
 */
class ItemHolder(itemView: View) : BaseViewHolder<Item>(itemView) {
    override fun onBind(item: Item?) {
        with(itemView){
            number.text = item?.num.toString()
            item_content.text = item?.content
        }
    }

    override fun onBind(data: Item, onClickListener: View.OnClickListener, context: Context) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}