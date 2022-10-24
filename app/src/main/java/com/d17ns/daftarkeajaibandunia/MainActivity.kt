package com.d17ns.daftarkeajaibandunia

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.d17ns.daftarkeajaibandunia.DaftarAdapter
import com.d17ns.daftarkeajaibandunia.Source
import com.d17ns.daftarkeajaibandunia.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //variabel recyclerView
    private lateinit var recyclerView: RecyclerView

    //variabel isLinearLayoutManager
    private var isLinearLayoutManager = true

    //function chooseLayout untuk menyediakan pilihan ListView dan GridView pada untuk class DaftarAdapter
    private fun chooseLayout() {
        if (isLinearLayoutManager) {
            recyclerView.layoutManager = LinearLayoutManager(this)
        }
        else {
            recyclerView.layoutManager = GridLayoutManager(this, 4)
        }
        recyclerView.adapter = DaftarAdapter(this)
    }

    //function setIcon untuk memberikan icon pada ListView dan GridView
    private fun setIcon(menuItem: MenuItem?) {
        if (menuItem == null)
            return

        menuItem.icon =
            if (isLinearLayoutManager)
                ContextCompat.getDrawable(this, R.drawable.ic_grid_layout)
            else ContextCompat.getDrawable(this, R.drawable.ic_linear_layout)
    }

    //function untuk menampilkan menu pilihan layout
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.layout_menu, menu)

        val layoutButton = menu?.findItem(R.id.action_switch_layout)
        setIcon(layoutButton)

        return true
    }

    //function untuk melakukan perubahan halaman layout ketika icon pilihan layout diclick
    override fun onOptionsItemSelected(item : MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_switch_layout -> {
                isLinearLayoutManager = !isLinearLayoutManager

                chooseLayout()
                setIcon(item)

                return true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    //function tampilan halaman utama aplikasi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        recyclerView = binding.recyclerView

        chooseLayout()
    }
}