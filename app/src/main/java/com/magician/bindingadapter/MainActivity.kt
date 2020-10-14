package com.magician.bindingadapter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.magician.bindingadapter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: MyRecyclerViewAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        initRecyclerView()
    }

    private fun initRecyclerView() {
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        adapter = MyRecyclerViewAdapter()
        binding.recyclerView.adapter = adapter

        displayUser()
    }

    private fun displayUser() {
        var userList = arrayListOf<User>(
            User("lady1", R.drawable.lady1),
            User("lady2", R.drawable.lady2),
            User("lady3", R.drawable.lady3),
            User("lady4", R.drawable.lady4),
            User("lady5", R.drawable.lady5),
            User("lady6", R.drawable.lady6),
            User("lady7", R.drawable.lady7),
            User("lady8", R.drawable.lady8),
            User("lady9", R.drawable.lady9),
            User("lady10", R.drawable.lady10),
            User("lady11", R.drawable.lady11),
            User("man1", R.drawable.man1),
            User("man2", R.drawable.man2),
            User("man3", R.drawable.man3),
            )


        adapter.setList(userList)
    }
}