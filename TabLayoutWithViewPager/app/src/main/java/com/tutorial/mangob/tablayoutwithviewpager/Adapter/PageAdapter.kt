package com.tutorial.mangob.tablayoutwithviewpager.Adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import com.tutorial.mangob.tablayoutwithviewpager.fragments.*
import com.tutorial.mangob.tablayoutwithviewpager.models.TabListType

/**
 * Created by mangob on 2017. 8. 20..
 */
class PageAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        when(position) {
            0 -> return AddFragment.newInstance()
            1 -> return ListFragment.newInstance()
            2 -> return DetailsFragment.newInstance()
        }
        return EmptyFragment.newInstance()
    }

    override fun getCount(): Int {
        return TabListType.size()
    }

    override fun getPageTitle(position: Int): CharSequence {
        return TabListType.from(position).toString()
    }
}