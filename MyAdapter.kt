package com.wijaya.aplikasiwijaya

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(
    private val klublist : ArrayList<Klub>
) : RecyclerView.Adapter<MyAdapter.klubHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): klubHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_row, parent, false)
        return klubHolder(itemView)
    }

    override fun onBindViewHolder(holder: klubHolder, position: Int) {
        val currentItem = klublist[position]
        holder.imgitem.setImageResource(currentItem.foto)
        holder.tvnama.text = currentItem.nama
        holder.tvdetil.text = currentItem.detil
    }

    override fun getItemCount(): Int {
        return klublist.size
    }
    class  klubHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        val imgitem : ImageView = itemView.findViewById(R.id.img_item)
        val tvnama : TextView = itemView.findViewById(R.id.tvnama)
        val tvdetil : TextView = itemView.findViewById(R.id.tvdetil)

        //langkah 4 membuat adapter yang berguna agar isi file array dihubungkan dengan layout
    }
}