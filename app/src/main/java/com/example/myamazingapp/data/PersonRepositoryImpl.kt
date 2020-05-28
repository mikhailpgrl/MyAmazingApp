package com.example.myamazingapp.data

import com.example.myamazingapp.Person
import com.example.myamazingapp.PersonId

class PersonRepositoryImpl(private val personDao: PersonDao) : PersonRepository {
    override suspend fun insert(person: Person) {
        personDao.insert(person)
    }

    override suspend fun getAllPersons() = personDao.getAllPersons()

    override suspend fun deleteById(id: PersonId) {
        personDao.deleteById(id)
    }

}