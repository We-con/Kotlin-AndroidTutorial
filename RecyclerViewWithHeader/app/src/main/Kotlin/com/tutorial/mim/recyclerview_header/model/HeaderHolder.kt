package com.tutorial.mim.recyclerview_header.model

import android.content.Context
import android.view.View
import kotlinx.android.synthetic.main.list_header.view.*

/**
 * Created by lf_wannabe on 27/08/2017.
 */
class HeaderHolder(itemView: View) : BaseViewHolder<Item>(itemView){

    override fun onBind(item: Item?) {
        itemView.header.text = item?.title
    }

    override fun onBind(data: Item, onClickListener: View.OnClickListener, context: Context) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}