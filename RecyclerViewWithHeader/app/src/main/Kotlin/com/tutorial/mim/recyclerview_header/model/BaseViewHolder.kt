package com.tutorial.mim.recyclerview_header.model

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.View

/**
 * Created by lf_wannabe on 27/08/2017.
 */
abstract class BaseViewHolder<T : Any>(itemView: View) : RecyclerView.ViewHolder(itemView) {

    abstract fun onBind(item: Item?)

    abstract fun onBind(data: Item, onClickListener: View.OnClickListener, context: Context)
}
