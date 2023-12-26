package com.example.newproje.domain

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
data class User(
    @PrimaryKey(autoGenerate = true) val uid: Int,
    @ColumnInfo() val firsName: String?,
    @ColumnInfo() val lastname: String?

)
