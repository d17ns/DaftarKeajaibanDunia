package com.d17ns.daftarkeajaibandunia

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

//data class Keajaiban untuk deklarasi variabel stringId dan imageId
data class Keajaiban(
    @StringRes val stringId: Int,
    @DrawableRes val imageId: Int
)