package com.example.newproje.data

import androidx.lifecycle.LiveData
import com.example.newproje.domain.User
import com.example.newproje.domain.dao.UserDao

class UserRepository(private val userDao: UserDao) {

    suspend fun insert(user: User){
        userDao.insert(user)
    }

    fun getAll(): LiveData<List<User>>{
        return userDao.getAll()
    }
}