package com.aashis.movieslist.viewPager

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.aashis.movieslist.R
import com.aashis.movieslist.inflate

class TopRatedFragment : Fragment() {
    private var myView: View? = null

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
            myView = container?.inflate(R.layout.toprated_fragment)
        }
        return myView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

}