package com.example.imagelist

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class imageAdapter(var context: Context, var imageList:List<Int>):BaseAdapter() {
    override fun getCount(): Int {
        return imageList.size
    }

    override fun getItem(position: Int): Any {
        return imageList[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var convertView = convertView
        val viewHolder: ViewHolder

        if(convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.activity_main, parent,false)
            viewHolder = ViewHolder()
            viewHolder.imageView = convertView.findViewById(R.id.imageView)
            convertView.tag = viewHolder


        }else{
            viewHolder = convertView.tag as ViewHolder
        }

        val imageResource = imageList[position]
        viewHolder.imageView.setImageResource(imageResource)

        return convertView!!


    }
    private class ViewHolder{
        lateinit var imageView: ImageView
    }

}