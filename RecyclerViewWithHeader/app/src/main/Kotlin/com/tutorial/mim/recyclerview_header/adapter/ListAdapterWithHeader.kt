package com.tutorial.mim.recyclerview_header.adapter

import android.support.v4.app.FragmentActivity
import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import com.tutorial.mim.recyclerview_header.model.Item

import android.view.LayoutInflater
import com.example.lf_wannabe.recyclerviewwithheader.R
import com.tutorial.mim.recyclerview_header.model.ItemHolder


/**
 * Created by lf_wannabe on 26/08/2017.
 */

abstract class ListAdapterWithHeader(val activity: FragmentActivity, protected val hasHeader: Boolean)
    : RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    private val HEADER_TYPE: Int = 0
    private val ITEM_TYPE: Int = 1

    private var list: ArrayList<Item> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder
        = when(viewType){
            HEADER_TYPE -> createHeaderView(activity.layoutInflater, parent)
            else -> ItemHolder(activity.layoutInflater.inflate(R.layout.list_content, parent, false))
        }

    protected abstract fun createHeaderView(layoutInflater: LayoutInflater, parent: ViewGroup): RecyclerView.ViewHolder

    protected abstract fun onBindHeaderView(holder: RecyclerView.ViewHolder, position: Int)

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (getItemViewType(position)) {
            HEADER_TYPE -> onBindHeaderView(holder, position)
            ITEM_TYPE -> (holder as ItemHolder).onBind(getItem(position))
        }
    }

    fun setData(list: ArrayList<Item>){
        // null 체크 필요없나 ?
        this.list = list
    }

    override fun getItemViewType(position: Int): Int {
        return if (hasHeader && position == 0) HEADER_TYPE else ITEM_TYPE
    }

    override fun getItemCount(): Int {
        return if (list != null) (list as ArrayList).size + (if (hasHeader) 1 else 0) else if (hasHeader) 1 else 0
    }

    private fun getItem(position: Int): Item? = list?.get(position - 1)

}