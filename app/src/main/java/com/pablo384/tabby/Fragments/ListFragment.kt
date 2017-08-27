package com.pablo384.tabby.Fragments


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.pablo384.tabby.Adapters.MyAdapter
import com.pablo384.tabby.Models.Country
import com.pablo384.tabby.Models.Person

import com.pablo384.tabby.R
import com.pablo384.tabby.Utils.listalibre
import kotlinx.android.synthetic.main.fragment_list.view.*


/**
 * A simple [Fragment] subclass.
 */
class ListFragment : Fragment() {

    var adaptador: MyAdapter? =null

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater!!.inflate(R.layout.fragment_list, container, false)


        with(view){
            adaptador=MyAdapter(this.context, listalibre)
            listView.adapter=adaptador
        }


        // Inflate the layout for this fragment
        return view
    }
    fun renderList(person: Person){
        listalibre.add(person)
        if (adaptador != null) {
            adaptador!!.notifyDataSetChanged()
            adaptador!!.addobj()
        }
    }

    override fun onResume() {
        super.onResume()
        if (adaptador != null) {
            adaptador!!.notifyDataSetChanged()
        }
    }
}// Required empty public constructor
