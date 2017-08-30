package com.tutorial.mim.recyclerview_header.ex

import android.support.v4.app.FragmentActivity
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.lf_wannabe.recyclerviewwithheader.R
import com.tutorial.mim.recyclerview_header.adapter.ListAdapterWithHeader
import com.tutorial.mim.recyclerview_header.model.HeaderHolder
import com.tutorial.mim.recyclerview_header.model.Item
import com.tutorial.mim.recyclerview_header.model.ItemHolder

/**
 * Created by lf_wannabe on 27/08/2017.
 */
class ExAdapter(ac: FragmentActivity, hasHeader: Boolean, item: Item)
    : ListAdapterWithHeader(ac, hasHeader) {
    var mItem: Item = item

    override fun createHeaderView(layoutInflater: LayoutInflater, parent: ViewGroup)
            : RecyclerView.ViewHolder =
            HeaderHolder(layoutInflater.inflate(R.layout.list_header, parent, false))

    override fun onBindHeaderView(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as HeaderHolder).onBind(mItem)
    }

}