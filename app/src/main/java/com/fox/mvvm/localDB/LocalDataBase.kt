package com.fox.mvvm.localDB

import androidx.room.Database
import androidx.room.RoomDatabase
import com.fox.mvvm.models.CategoriesApiModel
import com.fox.mvvm.models.MoviesApiModel

@Database(entities = [CategoriesApiModel::class, MoviesApiModel::class], version = 1)
abstract class LocalDataBase : RoomDatabase() {
    abstract val categoriesDao: CategoriesDAO
    abstract val moviesDao: MoviesDAO

}