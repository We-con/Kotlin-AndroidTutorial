package com.tutorial.mangob.fragmentmanager

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by mangob on 2017. 8. 27..
 */
class SlideshowFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?
                              , savedInstanceState: Bundle?): View {
        val rootView = inflater!!.inflate(R.layout.fragment_slideshow, container, false)
        return rootView
    }

    companion object {

        fun newInstance(): SlideshowFragment {
            val fragment = SlideshowFragment()
            return fragment
        }
    }

}