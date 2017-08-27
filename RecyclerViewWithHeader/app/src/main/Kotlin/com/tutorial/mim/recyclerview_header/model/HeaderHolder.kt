package com.tutorial.mim.recyclerview_header.model

import android.content.Context
import android.view.View
import android.widget.TextView
import com.example.lf_wannabe.recyclerviewwithheader.R

/**
 * Created by lf_wannabe on 27/08/2017.
 */
class HeaderHolder(itemView: View) : BaseViewHolder<Item>(itemView){

    private val title: TextView

    init {
        title = itemView.findViewById(R.id.header) as TextView
    }

    override fun onBind(item: Item?) {
        title.setText(item?.title)
    }

    override fun onBind(data: Item, onClickListener: View.OnClickListener, context: Context) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}