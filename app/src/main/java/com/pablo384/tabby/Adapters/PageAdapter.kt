package com.pablo384.tabby.Adapters

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import com.pablo384.tabby.Fragments.FormFragment
import com.pablo384.tabby.Fragments.ListFragment

/**
 * Created by pablo384 on 26/08/17.
 */
class PageAdapter(fm: FragmentManager, val numTabs:Int) : FragmentStatePagerAdapter(fm) {


    override fun getItem(position: Int): Fragment {

        when (position){
            0 -> return FormFragment()
            1 -> return ListFragment()
            else -> return FormFragment()
        }

    }

    override fun getCount(): Int=numTabs
}