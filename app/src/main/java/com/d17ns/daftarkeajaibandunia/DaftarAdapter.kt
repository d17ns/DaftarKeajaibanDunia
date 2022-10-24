package com.d17ns.daftarkeajaibandunia

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.d17ns.daftarkeajaibandunia.R
import com.d17ns.daftarkeajaibandunia.Keajaiban

class DaftarAdapter(private val context: Context)
    : RecyclerView.Adapter<DaftarAdapter.DaftarViewHolder>() {

    val dataList = Source().loadKeajaiban()

    class DaftarViewHolder(private val view: View): RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.item_title)
        val imageView: ImageView = view.findViewById(R.id.item_image)
    }

    override fun getItemCount() = dataList.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DaftarViewHolder {
        val layout = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.list_item, parent, false)

        return DaftarViewHolder(layout)
    }

    override fun onBindViewHolder(holder: DaftarViewHolder, position: Int) {
        val item = dataList.get(position)
        holder.textView.text = context.resources.getString(item.stringId)
        holder.imageView.setImageResource(item.imageId)

        holder.imageView.setOnClickListener {

            val intent = Intent(context, DetailActivity::class.java)

            context.startActivity(intent)
        }
    }
}