package com.ervalsa.keskustartupdigital.data.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.ervalsa.keskustartupdigital.data.model.UserModel

@Dao
interface UserDao {

    @Insert
    suspend fun insert(user: UserModel)


    suspend fun getAllUser(): LiveData<UserModel>


    suspend fun getUsername()
}