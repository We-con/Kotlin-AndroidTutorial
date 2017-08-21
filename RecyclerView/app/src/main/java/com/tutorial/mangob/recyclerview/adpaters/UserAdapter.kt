package com.tutorial.mangob.recyclerview.adpaters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.LinearLayout
import com.tutorial.mangob.recyclerview.R
import com.tutorial.mangob.recyclerview.models.User
import com.tutorial.mangob.recyclerview.models.UserHolder

/**
 * Created by mangob on 2017. 8. 20..
 */
class UserAdapter(private val users: ArrayList<User>) : RecyclerView.Adapter<UserHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserHolder {
        val userItem = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_user, parent, false) as LinearLayout
        return UserHolder(userItem)
    }

    override fun onBindViewHolder(holder: UserHolder, position: Int) {
        holder.update(users.get(position))
    }

    override fun getItemCount(): Int {
        return users.size
    }

}