package com.example.newproje.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.newproje.domain.User

@Database(entities = [User::class], version = 1)
abstract class AppDataBase: RoomDatabase() {
    abstract fun userDao():User


    companion object{
        //Singleton
        private var INSTANCE: AppDataBase? = null

        fun getData(context: Context):AppDataBase {
            if (INSTANCE!=null){
                return INSTANCE!!
            }else{
                val instance = Room.databaseBuilder(context, AppDataBase::class.java, "demodb").build()
                INSTANCE = instance
                return INSTANCE!!
            }
        }
    }


}