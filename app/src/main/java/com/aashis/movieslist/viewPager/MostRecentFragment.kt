package com.aashis.movieslist.viewPager

import android.content.Context
import android.content.res.Resources
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.aashis.movieslist.R
import com.aashis.movieslist.inflate
import com.aashis.movieslist.movieList.MyAdapter
import com.aashis.movieslist.movieList.MyData

class MostRecentFragment : Fragment() {
    private var myView: View? = null
    private lateinit var myData: MutableList<MyData>
    private lateinit var myAdapter: MyAdapter
    private lateinit var movieListRecycle: RecyclerView


    override fun onAttach(context: Context) {
        super.onAttach(context)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        if (myView == null) {
            myView = container?.inflate(R.layout.mostrecent_fragment)
        }
        return myView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        super.onViewCreated(view, savedInstanceState)
        movieListRecycle = view.findViewById(R.id.movieListRecycle)
        initRecyclerView()
    }

    private fun initRecyclerView() {
        myData = ArrayList()
        myData.add(
            MyData(
                getString(R.string.urlHiddenfigure),
                getString(R.string.hiddenFigure),
                7.9,
                9,
                74,
                false
            )
        )
        myData.add(
            MyData(
                getString(R.string.urlLalaLand),
                getString(R.string.lalaLand),
                8.4,
                8,
                93,
                false
            )
        )
        myData.add(
            MyData(
                getString(R.string.urlMoonLight),
                getString(R.string.moonLight),
                7.6,
                8,
                99,
                false
            )
        )
        myData.add(
            MyData(
                getString(R.string.urlZootopia),
                getString(R.string.zootopia),
                8.1,
                8,
                78,
                false
            )
        )
        myData.add(
            MyData(
                getString(R.string.urlAvatar),
                getString(R.string.avatar),
                9.1,
                10,
                99,
                false
            )
        )

        myData.add(
            MyData(
                getString(R.string.urlEverest),
                getString(R.string.everest),
                9.1,
                10,
                95,
                false
            )
        )


//        myAdapter = MyAdapter(myData, applicationContext)

        myAdapter = MyAdapter(myData) { position ->
            val myDataAtPosition = myData[position]
            if (myDataAtPosition.flag) {
                myDataAtPosition.flag = false
            } else {
                myDataAtPosition.flag = true
            }
            myAdapter.notifyDataSetChanged()
        }

        movieListRecycle.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)

        movieListRecycle.adapter = myAdapter
    }

}