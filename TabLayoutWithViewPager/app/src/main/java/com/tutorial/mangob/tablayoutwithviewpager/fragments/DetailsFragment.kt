package com.tutorial.mangob.tablayoutwithviewpager.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.tutorial.mangob.tablayoutwithviewpager.R

/**
 * Created by mangob on 2017. 8. 20..
 */
class DetailsFragment : Fragment(){

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val rootView = inflater!!.inflate(R.layout.fragment_details, container, false)
        return rootView
    }

    companion object {

        fun newInstance(): DetailsFragment {
            val fragment = DetailsFragment()
            return fragment
        }
    }
}