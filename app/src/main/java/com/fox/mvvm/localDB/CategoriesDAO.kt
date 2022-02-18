package com.fox.mvvm.localDB

import androidx.lifecycle.LiveData
import androidx.room.*
import com.fox.mvvm.models.CategoriesApiModel
import com.fox.mvvm.models.CategoriesModel

@Dao
interface CategoriesDAO {

        @Insert(onConflict = OnConflictStrategy.REPLACE)
        fun insertCategory(categoriesModel: CategoriesModel)

        @Query("SELECT * FROM category_data_table")
        fun loadCategories(): LiveData<List<CategoriesModel>>

        @Query("DELETE FROM category_data_table")
        suspend fun clear()

//    @Insert
//    suspend fun insertCategory(categoriesApiModel: CategoriesApiModel)
//
//    @Update
//    suspend fun updateCategory(categoriesApiModel: CategoriesApiModel)
//
//    @Delete
//    suspend fun deleteCategory(categoriesApiModel: CategoriesApiModel)


//    @Query("DELETE FROM category_data_table")
//    suspend  fun deleteAllCategories()

    @Query("SELECT * FROM category_data_table")
    fun getAllCategories(): LiveData<List<CategoriesApiModel>>
}