package com.example.wallithack.ui.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.wallithack.R
import com.example.wallithack.ui.ItemRepresentation

class ItemAdapter(

    var list : MutableList<ItemRepresentation>

) : BaseAdapter(){
    override fun getCount(): Int {
        return list.size
    }

    override fun getItem(position: Int): Any {
        return list.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view = convertView ?: LayoutInflater.from(parent?.context)
            .inflate(R.layout.item_representation, parent, false)

        val item = list.get(position)

        val itemName = view.findViewById<TextView>(R.id.name)
        val itemDescription = view.findViewById<TextView>(R.id.description)

        itemName.text = item.name

        return view

    }


}