package com.example.myamazingapp.data

import com.example.myamazingapp.Person

interface PersonRepository {

    suspend fun insert(person: Person)

    suspend fun getAllPersons(): List<Person>

}