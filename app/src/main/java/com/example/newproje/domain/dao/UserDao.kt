package com.example.newproje.domain.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.newproje.domain.User


@Dao
interface UserDao {

    @Insert
    suspend fun insert(user: User)

    @Query("SELECT * FROM user")
     fun getAll(): LiveData<List<User>>

    @Query("SELECT * FROM user where firsName LIKE :first AND lastname LIKE :lastname")
     fun findWithName(first:String, lastname: String): LiveData<List<User>>

     @Delete
     suspend fun delete(user: User)
    //CRUD
}