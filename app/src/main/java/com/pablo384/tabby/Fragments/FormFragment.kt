package com.pablo384.tabby.Fragments


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.pablo384.tabby.R


/**
 * A simple [Fragment] subclass.
 */
class FormFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view= inflater!!.inflate(R.layout.fragment_form, container, false)

        // Inflate the layout for this fragment
        return view
    }


}// Required empty public constructor
