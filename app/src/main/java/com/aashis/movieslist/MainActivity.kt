package com.aashis.movieslist

import android.os.Bundle
import android.view.Menu
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.ViewPager
import com.aashis.movieslist.movieList.MyAdapter
import com.aashis.movieslist.movieList.MyData
import com.aashis.movieslist.movieList.MyViewHolder
import com.aashis.movieslist.viewPager.MostRecentFragment
import com.aashis.movieslist.viewPager.TopRatedFragment
import com.aashis.movieslist.viewPager.ViewPagerAdapter
import com.google.android.material.tabs.TabLayout


class MainActivity : AppCompatActivity() {

    private lateinit var toolbar: Toolbar

    private lateinit var tabLayout: TabLayout
    private lateinit var viewPager: ViewPager
    private var viewPagerAdapter: ViewPagerAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toolbar = findViewById(R.id.toolbar)
        tabLayout = findViewById(R.id.tabLayout)
        viewPager = findViewById(R.id.viewPager)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "History" // Nullable
        // Not null


        initViewPager()

    }

    private fun initViewPager() {
        //viewpager
        viewPagerAdapter = ViewPagerAdapter(supportFragmentManager)
        viewPager.adapter = viewPagerAdapter

        //this is view pager fragment
        val mostRecentFragment = MostRecentFragment()
        viewPagerAdapter?.addFragment(mostRecentFragment, "Most Recent")

        val topRatedFragment = TopRatedFragment()
        viewPagerAdapter?.addFragment(topRatedFragment, "Top Rated")

        //notify view pager adapter
        viewPagerAdapter?.notifyDataSetChanged()
        tabLayout.setupWithViewPager(viewPager)


    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }



    private fun bookmarkClick(position: Int) {

    }


}