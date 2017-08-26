package com.pablo384.tabby

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.view.PagerAdapter
import android.support.v7.widget.Toolbar
import com.pablo384.tabby.Adapters.PageAdapter
import com.pablo384.tabby.Adapters.ViewPagerOnTabSelectedListener
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar as Toolbar)

        tabLayout.addTab(tabLayout.newTab().setText("Form"))
        tabLayout.addTab(tabLayout.newTab().setText("List"))

        val adapter = PageAdapter(supportFragmentManager, tabLayout.tabCount)
        viewPager.adapter=adapter
        viewPager.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tabLayout))
        tabLayout.addOnTabSelectedListener(ViewPagerOnTabSelectedListener(viewPager))
    }
}
