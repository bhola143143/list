package com.example.listdata

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.viewpager2.widget.ViewPager2
import com.example.listdata.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {

    private lateinit var context: Context
    private lateinit var mainActivityBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainActivityBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainActivityBinding.root)


        val data4 = ArrayList<Title>()

        val tabadapter = ViewPagerTabAdapter(data4)
        mainActivityBinding.viewPagerTab.adapter = tabadapter
        mainActivityBinding.viewPagerTab.clipToPadding = false
        mainActivityBinding.viewPagerTab.clipChildren = false
        mainActivityBinding.viewPagerTab.offscreenPageLimit = 2

        for (i in 0 until 3) {
            mainActivityBinding.tabTitleLayout.newTab()
                .setText("${title}").let {
                    mainActivityBinding.tabTitleLayout.addTab(
                        it
                    )
                }
        }



        mainActivityBinding.tabTitleLayout.addOnTabSelectedListener(object :
            TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                mainActivityBinding.viewPagerTab.currentItem = tab?.position!!
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
            }
        })

        mainActivityBinding.viewPagerTab.registerOnPageChangeCallback(object :
            ViewPager2.OnPageChangeCallback() {
            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {
                super.onPageScrolled(position, positionOffset, positionOffsetPixels)
            }

            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                mainActivityBinding.tabTitleLayout.getTabAt(position)?.select()
            }

            override fun onPageScrollStateChanged(state: Int) {
                super.onPageScrollStateChanged(state)
            }
        })

        mainActivityBinding.recState.layoutManager = LinearLayoutManager(this)
        val data2 = ArrayList<Data>()

        data2.add(
            Data(
                "David borg",
                "Title:Flying wings",
                "2342",
                "pop",
                "4735",
                "Like",
                "136",
                "followed",
                "...",
                "1",
                "Ranking"
            )
        )
        data2.add(
            Data(
                "David borg",
                "Title:Flying wings",
                "2342",
                "pop",
                "4735",
                "Like",
                "136",
                "followed",
                "...",
                "2",
                "Ranking"
            )
        )
        data2.add(
            Data(
                "David borg",
                "Title:Flying wings",
                "2342",
                "pop",
                "4735",
                "Like",
                "136",
                "followed",
                "...",
                "3",
                "Ranking"
            )
        )
        data2.add(
            Data(
                "David borg",
                "Title:Flying wings",
                "2342",
                "pop",
                "4735",
                "Like",
                "136",
                "followed",
                "...",
                "4",
                "Ranking"
            )
        )
        data2.add(
            Data(
                "David borg",
                "Title:Flying wings",
                "2342",
                "pop",
                "4735",
                "Like",
                "136",
                "followed",
                "...",
                "5",
                "Ranking"
            )
        )
        data2.add(
            Data(
                "David borg",
                "Title:Flying wings",
                "2342",
                "pop",
                "4735",
                "Like",
                "136",
                "followed",
                "...",
                "6",
                "Ranking"
            )
        )
        data2.add(
            Data(
                "David borg",
                "Title:Flying wings",
                "2342",
                "pop",
                "4735",
                "Like",
                "136",
                "followed",
                "...",
                "7",
                "Ranking"
            )
        )

        val adapter = FollowingAdapter(data2)
        mainActivityBinding.recState.adapter = adapter
    }
}