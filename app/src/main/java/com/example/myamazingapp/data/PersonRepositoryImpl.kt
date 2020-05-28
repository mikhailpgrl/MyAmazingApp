package com.example.myamazingapp.data

import com.example.myamazingapp.Person

class PersonRepositoryImpl(private val personDao: PersonDao) : PersonRepository {
    override suspend fun insert(person: Person) {
        personDao.insert(person)
    }

    override suspend fun getAllPersons() = personDao.getAllPersons()

}