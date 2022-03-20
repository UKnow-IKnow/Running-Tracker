package com.example.runningtracker.di

import android.content.Context
import android.content.Context.MODE_PRIVATE
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.runningtracker.data.Database
import com.example.runningtracker.util.Constants.DATABASE_NAME
import com.example.runningtracker.util.Constants.SHARED_PREFERENCE_NAME
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Singleton
    @Provides
    fun provideDatabase(
        @ApplicationContext context: Context
    ) = Room.databaseBuilder(
        context,
        Database::class.java,
        DATABASE_NAME
    ).build()

    @Singleton
    @Provides
    fun provideDao(database: Database) = database.getRunDao()

    @Singleton
    @Provides
    fun provideSharedPreference(
        @ApplicationContext context: Context
    ) = context.getSharedPreferences(SHARED_PREFERENCE_NAME, MODE_PRIVATE)

}