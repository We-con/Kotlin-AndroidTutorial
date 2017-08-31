package com.tutorial.mim.recyclerview_header.adapter

import android.support.v4.app.FragmentActivity
import android.support.v7.widget.RecyclerView
import com.tutorial.mim.recyclerview_header.model.Item
import android.view.View
import io.realm.RealmResults


/**
 * Created by lf_wannabe on 26/08/2017.
 */

abstract class ListAdapterWithHeader(val activity: FragmentActivity,
                                     protected val hasHeader: Boolean)
    : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    protected val HEADER_TYPE: Int = 0
    protected val ITEM_TYPE: Int = 1

    private lateinit var list: RealmResults<*>

    companion object {
        lateinit var mOnItemClickListener: OnItemClickListener
    }

    interface OnItemClickListener {
        fun onItemClick(v: View, position: Int) {}
    }

    fun setOnItemClickListener(onItemClickListener: OnItemClickListener) {
        mOnItemClickListener = onItemClickListener
    }

    override fun getItemViewType(position: Int): Int {
        return if (hasHeader && position == 0) HEADER_TYPE else ITEM_TYPE
    }

    override fun getItemCount(): Int {
        return list.size + if (hasHeader) 1 else 0
    }

    protected fun getItem(position: Int): Any? = list[position - if (hasHeader) 1 else 0]

    fun setData(list: RealmResults<*>) {
        this.list = list
        notifyDataSetChanged()
    }
}