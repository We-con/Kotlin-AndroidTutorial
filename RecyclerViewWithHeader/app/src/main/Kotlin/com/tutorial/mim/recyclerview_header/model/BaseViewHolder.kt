package com.tutorial.mim.recyclerview_header.model

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.View
import io.realm.RealmObject

/**
 * Created by lf_wannabe on 27/08/2017.
 */
abstract class BaseViewHolder<H: RealmObject, T: RealmObject>(itemView: View) : RecyclerView.ViewHolder(itemView){

    abstract fun onBind(item: T?)

    abstract fun onBindHeader(header: H?)

}
