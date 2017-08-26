package com.pablo384.tabby.Fragments


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.pablo384.tabby.Adapters.MyAdapter
import com.pablo384.tabby.Models.Country
import com.pablo384.tabby.Models.Person

import com.pablo384.tabby.R
import kotlinx.android.synthetic.main.fragment_list.view.*


/**
 * A simple [Fragment] subclass.
 */
class ListFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater!!.inflate(R.layout.fragment_list, container, false)

        val lista= arrayListOf<Person>()
        lista.add(Person("Pablo", Country("Republica Dominicana","DO")))
        lista.add(Person("Pablo", Country("Republica Dominicana","DO")))
        lista.add(Person("Pablo", Country("Republica Dominicana","DO")))
        lista.add(Person("Pablo", Country("Republica Dominicana","DO")))

        with(view){
            listView.adapter=MyAdapter(this.context,lista)
        }


        // Inflate the layout for this fragment
        return view
    }

}// Required empty public constructor
