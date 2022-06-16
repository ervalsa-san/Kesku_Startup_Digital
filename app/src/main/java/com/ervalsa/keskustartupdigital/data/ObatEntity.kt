package com.ervalsa.keskustartupdigital.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class ObatEntity (
    var obatId: String,
    var title: String,
    var description: String,
    var price: String,
    var image: Int
) : Parcelable