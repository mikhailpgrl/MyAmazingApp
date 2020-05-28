package com.example.myamazingapp

import android.app.Application
import com.example.myamazingapp.data.AppDatabase
import com.example.myamazingapp.data.PersonRepository
import com.example.myamazingapp.data.PersonRepositoryImpl

class App : Application() {

    private lateinit var database: AppDatabase

    lateinit var repository: PersonRepository

    override fun onCreate() {
        super.onCreate()

        database =
            AppDatabase.buildDatabase(
                applicationContext,
                DATABASE_NAME
            )

        repository =
            PersonRepositoryImpl(database.personDao())
    }


    companion object {
        private const val DATABASE_NAME = "my_amazing_app_database.db"
    }
}