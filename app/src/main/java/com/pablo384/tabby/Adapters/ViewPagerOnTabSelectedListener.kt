package com.pablo384.tabby.Adapters

import android.support.design.widget.TabLayout
import android.support.v4.view.ViewPager
import android.util.Log
import android.widget.TableLayout

/**
 * Created by pablo384 on 26/08/17.
 */
class ViewPagerOnTabSelectedListener(val viewPager: ViewPager) : TabLayout.OnTabSelectedListener{
    override fun onTabReselected(tab: TabLayout.Tab) {

    }

    override fun onTabUnselected(tab: TabLayout.Tab) {
    }

    override fun onTabSelected(tab: TabLayout.Tab) {
        viewPager.currentItem=tab.position
    }
}