package com.example.navtab

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.example.navtab.TabFragment1
import com.example.navtab.TabFragment2
import com.example.navtab.TabFragment3

class PagerAdapter(val manager: FragmentManager, val numofTabs: Int): FragmentStatePagerAdapter(manager) {
    override fun getItem(position: Int): Fragment {
        return when(position){
            0 -> TabFragment1()
            1 -> TabFragment2()
            2 -> TabFragment3()
            else -> TabFragment1()
        }
    }

    override fun getCount(): Int {
        return numofTabs
    }

}