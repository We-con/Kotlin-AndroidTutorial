package com.tutorial.mim.recyclerview_header.model

import io.realm.RealmObject

/**
 * Created by lf_wannabe on 27/08/2017.
 */
open class Item(
        open var num: Int = 0,
        open var title: String = "TITLE",
        open var content: String = "CONTENT"
): RealmObject()