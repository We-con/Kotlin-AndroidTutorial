package com.tutorial.mim.recyclerview_header.model

import android.content.Context
import android.view.View
import android.widget.TextView
import com.example.lf_wannabe.recyclerviewwithheader.R

/**
 * Created by lf_wannabe on 27/08/2017.
 */
class ItemHolder(itemView: View) : BaseViewHolder<Any>(itemView) {
    private var number: TextView?
    private var content: TextView?

    init {
        number = (itemView.findViewById(R.id.number)) as TextView
        content = (itemView.findViewById(R.id.item_content)) as TextView
    }

    override fun onBind(item: Item?) {
        number?.setText(item?.num.toString())
        content?.setText(item?.content)
    }

    override fun onBind(data: Item, onClickListener: View.OnClickListener, context: Context) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}