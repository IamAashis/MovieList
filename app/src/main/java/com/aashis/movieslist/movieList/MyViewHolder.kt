package com.aashis.movieslist.movieList

import android.view.View
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.aashis.movieslist.R

class MyViewHolder(private val itemview: View, private  val bookmarkClick:(position:Int)-> Unit) : RecyclerView.ViewHolder(itemview) {
    val textViewMovieTitle: TextView = itemView.findViewById(R.id.movieTitle)
    val image: ImageView = itemview.findViewById(R.id.image)
    val textViewrating: TextView = itemView.findViewById(R.id.rating)
    val textViewratingBlue: TextView = itemView.findViewById(R.id.ratingBlue)
    val textViewmetaScore: TextView = itemView.findViewById(R.id.metaScore)
    val bookmarkLayout: RelativeLayout = itemView.findViewById(R.id.bookmarkLayout)
    val bookmarkAdd: ImageView = itemView.findViewById(R.id.bookmarkAdd)

    init {
        bookmarkLayout.setOnClickListener {
            bookmarkClick(adapterPosition)
        }

    }

}