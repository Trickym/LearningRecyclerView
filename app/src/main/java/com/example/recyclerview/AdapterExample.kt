package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdapterExample(private val exampleList:List<ModelClass>) : RecyclerView.Adapter<AdapterExample.ViewHolderExample>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderExample {
        val itemView = LayoutInflater.from(parent.context).
        inflate(R.layout.item_view,parent,false)
        return  ViewHolderExample(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolderExample, position: Int) {
        val currentItem = exampleList[position]
        holder.imageView.setImageResource(currentItem.img)
        holder.userName.text = currentItem.name
    }

    override fun getItemCount(): Int {
        return exampleList.size
    }

    class ViewHolderExample(itemView:View) : RecyclerView.ViewHolder(itemView){
        val imageView:ImageView = itemView.findViewById(R.id.image_view)
        val userName:TextView = itemView.findViewById(R.id.user_name)

    }
}