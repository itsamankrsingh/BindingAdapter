package com.magician.bindingadapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.magician.bindingadapter.databinding.UserListBinding

class MyRecyclerViewAdapter() : RecyclerView.Adapter<MyViewHolder>() {

    private val userList = ArrayList<User>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding: UserListBinding =
            DataBindingUtil.inflate(
                layoutInflater,
                R.layout.user_list, parent, false
            )
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(userList[position])
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    fun setList(users: List<User>) {
        userList.clear()
        userList.addAll(users)
    }
}

class MyViewHolder(val binding: UserListBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bind(userItem: User) {
        binding.user = userItem
    }
}