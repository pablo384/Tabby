package com.pablo384.tabby.Activities

import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.annotation.RequiresApi
import android.support.design.widget.TabLayout
import android.support.v7.widget.Toolbar
import com.pablo384.tabby.Adapters.PageAdapter
import com.pablo384.tabby.Adapters.ViewPagerOnTabSelectedListener
import com.pablo384.tabby.Fragments.ListFragment
import com.pablo384.tabby.Interfaces.FormFragmentCommunication
import com.pablo384.tabby.Models.Person
import com.pablo384.tabby.R
import com.pablo384.tabby.Utils.listalibre
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), FormFragmentCommunication{

    companion object {
        var listaPersona= arrayListOf<Person>()
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar as Toolbar)

        tabLayout.addTab(tabLayout.newTab().setText("Form"))
        tabLayout.addTab(tabLayout.newTab().setText("List"))
        tabLayout.tabGravity=TabLayout.GRAVITY_FILL

        val adapter = PageAdapter(supportFragmentManager, tabLayout.tabCount)
        viewPager.adapter=adapter
        viewPager.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tabLayout))
        tabLayout.addOnTabSelectedListener(ViewPagerOnTabSelectedListener(viewPager))
    }
    override fun sendPerson(person: Person) {
        ListFragment().renderList(person)
        viewPager.currentItem=1
    }

    override fun onStop() {
        super.onStop()

    }
}
