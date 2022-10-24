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

//class DaftarAdapter untuk menampilkan isi dari halaman utama aplikasi
class DaftarAdapter(private val context: Context)
    : RecyclerView.Adapter<DaftarAdapter.DaftarViewHolder>() {

    //variabel dataList memanggil data dari class Source, function loadKeajaiban()
    val dataList = Source().loadKeajaiban()

    //class DaftarViewHolder untuk menampilkan menu utama aplikasi
    class DaftarViewHolder(private val view: View): RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.item_title)
        val imageView: ImageView = view.findViewById(R.id.item_image)
    }

    override fun getItemCount() = dataList.size

    //function untuk membuat View Holder pada halaman utama aplikasi
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DaftarViewHolder {
        val layout = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.list_item, parent, false)

        return DaftarViewHolder(layout)
    }

    //function untuk update data dari View Holder pada halaman utama aplikasi
    override fun onBindViewHolder(holder: DaftarViewHolder, position: Int) {
        val item = dataList.get(position)
        holder.textView.text = context.resources.getString(item.stringId)
        holder.imageView.setImageResource(item.imageId)

        //memberikan function clickListener pada imageView
        holder.imageView.setOnClickListener {

            //intent untuk mengarahkan click ke class DetailActivity
            val intent = Intent(context, DetailActivity::class.java)

            context.startActivity(intent)
        }
    }
}