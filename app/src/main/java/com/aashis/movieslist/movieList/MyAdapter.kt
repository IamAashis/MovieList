package com.aashis.movieslist.movieList

import android.content.res.ColorStateList
import android.graphics.Color
import android.util.Log
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.aashis.movieslist.R
import com.aashis.movieslist.inflate
import com.squareup.picasso.Picasso

class MyAdapter(
    private val myDataList: MutableList<MyData>,
//    private val context: Context,
    private val bookmarkClick: (position:Int) -> Unit,


) : RecyclerView.Adapter<MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        MyViewHolder(parent.inflate(R.layout.custom_movie_list)) { position ->
            bookmarkClick(position)
        }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        val myData = myDataList.get(position)


        holder.textViewMovieTitle.setText(myData.movieTitle)
        holder.textViewmetaScore.setText(myData.metaScore.toString())
        holder.textViewrating.setText(myData.movieRatingyellow.toString())

        Picasso.get().load(myData.imageUrl).into(holder.image)

        if (myData.flag){
            holder.bookmarkAdd.imageTintList = ColorStateList.valueOf(Color.YELLOW)
            print("true")
            Log.d("debug","testing")
        }else{
            holder.bookmarkAdd.imageTintList = ColorStateList.valueOf(Color.WHITE)
            print("false")

        }

    }

    override fun getItemCount() = myDataList.count()
}

