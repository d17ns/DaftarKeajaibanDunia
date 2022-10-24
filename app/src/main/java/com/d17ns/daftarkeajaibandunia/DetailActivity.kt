package com.d17ns.daftarkeajaibandunia

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

//class DetailActivity sebagai activity kedua
class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        //title pada halaman DetailActivity
        title = "Informasi Detail"
    }
}