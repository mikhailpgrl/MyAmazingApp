package com.example.myamazingapp.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.myamazingapp.Person

@Dao
interface PersonDao {

    @Insert
    suspend fun insert(person: Person)

    @Query("SELECT * FROM ${Person.TABLE_NAME}")
    suspend fun getAllPersons(): List<Person>

}