package com.tutorial.mangob.tablayoutwithviewpager.models

/**
 * Created by mangob on 2017. 8. 20..
 */
enum class TabListType {
    Add,
    List,
    Details;

    companion object {
        fun from(position: Int): TabListType = TabListType.values()[position]
        fun size() : Int = TabListType.values().size
    }
}