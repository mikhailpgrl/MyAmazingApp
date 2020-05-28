package com.example.myamazingapp

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.myamazingapp.Person.Companion.TABLE_NAME

@Entity(
    tableName = TABLE_NAME
)
data class Person(
    @PrimaryKey
    val id: String,
    val name: String,
    val description: String,
    val avatarUrl: String
) {

    companion object {
        const val TABLE_NAME = "Person"

        const val ID = "Id"
        const val NAME = "Name"
        const val DESCRIPTION = "Description"
        const val AVATAR_URL = "AvatarUrl"
    }
}