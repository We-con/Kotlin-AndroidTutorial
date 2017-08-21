package com.tutorial.mangob.recyclerview.models

import android.support.v7.widget.RecyclerView
import android.view.View
import kotlinx.android.synthetic.main.item_user.view.*

/**
 * Created by mangob on 2017. 8. 20..
 */
class UserHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun update(user: User) {
        itemView.text_user_firstname.text = user.firstName
        itemView.text_user_lastname.text = user.lastName
        itemView.text_user_address.text = user.address
        itemView.text_user_nationality.text = user.nationality
    }

}