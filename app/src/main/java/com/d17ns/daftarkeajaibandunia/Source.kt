package com.d17ns.daftarkeajaibandunia

import com.d17ns.daftarkeajaibandunia.R
import com.d17ns.daftarkeajaibandunia.Keajaiban

//class Source untuk deklarasi data list / isi dari aplikasi
class Source() {

    //function loadKeajaiban
    fun loadKeajaiban(): List<Keajaiban> {

        //memanggil data dari string dan drawable
        return listOf<Keajaiban>(
            Keajaiban(R.string.keajaiban1, R.drawable.keajaiban1),
            Keajaiban(R.string.keajaiban2, R.drawable.keajaiban2),
            Keajaiban(R.string.keajaiban3, R.drawable.keajaiban3),
            Keajaiban(R.string.keajaiban4, R.drawable.keajaiban4),
            Keajaiban(R.string.keajaiban5, R.drawable.keajaiban5),
            Keajaiban(R.string.keajaiban6, R.drawable.keajaiban6),
            Keajaiban(R.string.keajaiban7, R.drawable.keajaiban7),
        )

    }
}