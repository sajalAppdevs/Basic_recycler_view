package com.sajal.recycleviwe1

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyViewHolder(itemView:View):RecyclerView.ViewHolder(itemView) {
    val textViewItem:TextView=itemView.findViewById(R.id.textViewItem)
}