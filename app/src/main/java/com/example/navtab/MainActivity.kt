package com.example.navtab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.PagerAdapter
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(toolbar)
        setTabLayout()

        val adapter = PagerAdapter(supportFragmentManager, tab_layout.tabCount)
        pager.adapter= adapter
        setListenerForClick()

    }
    private fun setTabLayout (){
        tab_layout.addTab(tab_layout.newTab().setText("Top Stories"))
        tab_layout.addTab(tab_layout.newTab().setText("Tech News"))
        tab_layout.addTab(tab_layout.newTab().setText("Cooking"))

        tab_layout.tabGravity= TabLayout.GRAVITY_FILL
    }
}
