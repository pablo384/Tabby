package com.pablo384.tabby.Adapters

import android.content.Context
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.pablo384.tabby.Models.Person
import com.pablo384.tabby.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.listitem.view.*

/**
 * Created by pablo384 on 26/08/17.
 */
class MyAdapter(val context: Context, val list: ArrayList<Person>) : BaseAdapter() {

    private val mInflato = LayoutInflater.from(context)

    override fun getItem(position: Int): Any = list[position]

    override fun getItemId(position: Int): Long = position.toLong()

    override fun getCount(): Int= list.size

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view:View
        val vh:ListHolder
        if (convertView == null){
            view = this.mInflato.inflate(R.layout.listitem, parent,false)
            vh = ListHolder(view)
            view.tag = vh
        }else{
            view = convertView
            vh = view.tag as ListHolder
        }

        vh.name.text=list[position].name
        vh.country.text=list[position].country.name
        Picasso.with(view.context).load(Uri.parse(list[position].country.getURLCountry())).into(vh.img)

        return view

    }
    fun addobj(){
        notifyDataSetChanged()
    }

    private class ListHolder(view: View){
        val name:TextView = view.findViewById(R.id.textViewName)
        val country:TextView = view.findViewById(R.id.textViewCountry)
        val img:ImageView = view.findViewById(R.id.imgCountry)
    }
}