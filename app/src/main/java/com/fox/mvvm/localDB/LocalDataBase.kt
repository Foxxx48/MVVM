package com.fox.mvvm.localDB

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.fox.mvvm.models.CategoriesModel

@Database(entities = [CategoriesModel::class], version = 1)
abstract class LocalDataBase : RoomDatabase() {
    abstract val categoriesDao: CategoriesDAO
//    abstract val moviesDao: MoviesDAO

//    companion object {
//        @Volatile
//        private var INSTANCE: com.fox.mvvm.localDB.LocalDataBase? = null
//        fun getInstance(context: Context): com.fox.mvvm.localDB.LocalDataBase {
//            synchronized(this) {
//                var instance = INSTANCE
//                if (instance == null) {
//                    instance = Room.databaseBuilder(
//                        context.applicationContext,
//                        com.fox.mvvm.localDB.LocalDataBase::class.java,
//                        "dataBase"
//                    ).build()
//                }
//                return instance
//            }
//        }
//    }
}