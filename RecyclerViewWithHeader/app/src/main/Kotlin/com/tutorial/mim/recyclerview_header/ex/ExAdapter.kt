package com.tutorial.mim.recyclerview_header.ex

import android.support.v4.app.FragmentActivity
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.lf_wannabe.recyclerviewwithheader.R
import com.tutorial.mim.recyclerview_header.adapter.ListAdapterWithHeader
import com.tutorial.mim.recyclerview_header.model.BaseViewHolder
import com.tutorial.mim.recyclerview_header.model.Item
import com.tutorial.mim.recyclerview_header.model.ItemHolder
import io.realm.RealmResults

/**
 * Created by lf_wannabe on 27/08/2017.
 */
class ExAdapter(ac: FragmentActivity, hasHeader: Boolean, item: Item)
    : ListAdapterWithHeader<Item, ItemHolder>(ac, hasHeader) {
    var mItem: Item = item

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ItemHolder =
                        when (viewType) {
                HEADER_TYPE -> ItemHolder(LayoutInflater.from(parent!!.context)
                            .inflate(R.layout.list_header, parent, false))
                else -> ItemHolder(LayoutInflater.from(parent!!.context)
                        .inflate(R.layout.list_content, parent, false))
            }

    override fun onBindViewHolder(holder: ItemHolder?, position: Int) {
        when (getItemViewType(position)) {
            HEADER_TYPE ->
                        holder!!.onBindHeader(mItem)
            ITEM_TYPE -> {
                with(holder!!){
                    onBind(getItem(position))

                    // setOnClickListener를 부모에게 숨기고 싶다
                    holder.itemView.setOnClickListener {
                        view ->
                        if (mOnItemClickListener != null) {
                            mOnItemClickListener.onItemClick(view, layoutPosition)
                        }
                    }
                }
            }
        }
    }

//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder =
//            when (viewType) {
//                HEADER_TYPE -> ItemHolder(LayoutInflater.from(parent.context)
//                            .inflate(R.layout.list_header, parent, false))
//                else -> ItemHolder(LayoutInflater.from(parent.context)
//                        .inflate(R.layout.list_content, parent, false))
//            }
//
//    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
//        when (getItemViewType(position)) {
//            HEADER_TYPE ->
//                        (holder as ItemHolder).onBindHeader(mItem)
//            ITEM_TYPE -> {
//                with(holder as ItemHolder){
//                    onBind(getItem(position) as Item)
//
//                    // setOnClickListener를 부모에게 숨기고 싶다
//                    holder.itemView.setOnClickListener {
//                        view ->
//                        if (mOnItemClickListener != null) {
//                            mOnItemClickListener.onItemClick(view, layoutPosition)
//                        }
//                    }
//                }
//            }
//        }
//    }
}