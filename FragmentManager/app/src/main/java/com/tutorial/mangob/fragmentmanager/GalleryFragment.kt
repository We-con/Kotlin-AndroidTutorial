package com.tutorial.mangob.fragmentmanager

import android.support.v4.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by mangob on 2017. 8. 27..
 */
class GalleryFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?
                              , savedInstanceState: Bundle?): View {
        val rootView = inflater!!.inflate(R.layout.fragment_gallery, container, false)
        return rootView
    }

    companion object {

        fun newInstance(): GalleryFragment {
            val fragment = GalleryFragment()
            return fragment
        }
    }

}