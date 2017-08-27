package com.pablo384.tabby.Fragments


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.pablo384.tabby.Models.Country
import com.pablo384.tabby.Models.Person

import com.pablo384.tabby.R
import kotlinx.android.synthetic.main.fragment_form.*
import kotlinx.android.synthetic.main.fragment_form.view.*
import android.R.array
import android.content.Context
import android.widget.Toast
import com.pablo384.tabby.Interfaces.FormFragmentCommunication


/**
 * A simple [Fragment] subclass.
 */
class FormFragment : Fragment() {

    private lateinit var comunication:FormFragmentCommunication

    override fun onAttach(context: Context) {
        super.onAttach(context)
        try {
            comunication = context as FormFragmentCommunication
        }catch (e:Exception){
            e.printStackTrace()
        }
    }

    override fun onDetach() {
        super.onDetach()
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view= inflater!!.inflate(R.layout.fragment_form, container, false)
        val lista= resources.getStringArray(R.array.country_array)
        val adapter:ArrayAdapter<String> = ArrayAdapter(this.context,
                android.R.layout.simple_spinner_item, lista)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        view.spinnerCountry.adapter=adapter

        view.buttonAdd.setOnClickListener {
            comunication.sendPerson(Person(view.editTextName.text.toString(), Country(spinnerCountry.selectedItem.toString())))

        }



        // Inflate the layout for this fragment
        return view
    }


}// Required empty public constructor
