package com.ervalsa.keskustartupdigital.data.model

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Entity(tableName = "user_table")
@Parcelize
data class UserModel (

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "userId")
    var userId: Int,

    @ColumnInfo(name = "email")
    var email: String,

    @ColumnInfo(name = "nama")
    var nama: String,

    @ColumnInfo(name = "password")
    var password: String,

    @ColumnInfo(name = "photoUrl")
    var photoUrl: String
) : Parcelable