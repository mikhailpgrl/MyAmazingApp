package com.example.myamazingapp.data

import com.example.myamazingapp.Person
import com.example.myamazingapp.PersonId

interface PersonRepository {

    suspend fun insert(person: Person)

    suspend fun getAllPersons(): List<Person>

    suspend fun deleteById(id: PersonId)
}