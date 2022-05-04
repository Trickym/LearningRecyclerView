package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private var recyclerView:RecyclerView?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView= findViewById(R.id.recycler_view)
        val exampleList=ArrayList<ModelClass>()
        var a = ModelClass(
            1,
            R.drawable.use_dp,
            "Prashant"
        )

        var b = ModelClass(
            2,
            R.drawable.use_dp,
            "Rahul"
        )
        var c = ModelClass(
            3,
            R.drawable.use_dp,
            "Arpit"
        )
        var d = ModelClass(
            4,
            R.drawable.use_dp,
            "Ayush"
        )
        var e = ModelClass(
            5,
            R.drawable.use_dp,
            "Tommer"
        )
        var f = ModelClass(
            6,
            R.drawable.use_dp,
            "Roshan"
        )
        var g = ModelClass(
            7,
            R.drawable.use_dp,
            "Shivam"
        )

        exampleList?.add(a)
        exampleList?.add(b)
        exampleList?.add(c)
        exampleList?.add(d)
        exampleList?.add(e)
        exampleList?.add(f)
        exampleList?.add(g)
        exampleList?.add(e)
        exampleList?.add(f)
        exampleList?.add(g)

        if(!exampleList.isNullOrEmpty()){
            recyclerView!!.adapter = AdapterExample(exampleList)
            recyclerView!!.layoutManager = LinearLayoutManager(this)
            recyclerView!!.setHasFixedSize(true)
        }

    }
}