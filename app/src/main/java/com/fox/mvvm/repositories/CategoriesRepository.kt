package com.fox.mvvm.repositories

import android.content.Context
import androidx.lifecycle.LiveData
import com.fox.mvvm.dataSource.CategoriesApiDataSource
import com.fox.mvvm.dataSource.CategoriesDataSource
import com.fox.mvvm.domain.repositoryDomain.CategoriesCall
import com.fox.mvvm.localDB.CategoriesDAO
import com.fox.mvvm.models.CategoriesModel

class CategoriesRepository (private val categoriesApiDataSource: CategoriesApiDataSource,
                            private val categoriesDataSource: CategoriesDataSource
): CategoriesCall {

    override fun loadCategories(): LiveData<List<CategoriesModel>> {
        return categoriesDataSource.loadCategories()
    }

    override suspend fun startMigration(context: Context) {
        categoriesDataSource.clear()
        categoriesApiDataSource.startMigration(context)
    }


//    val categories = categoryDao.getAllCategories()
//
//    suspend fun insertCategory(categoryModel: CategoriesModel) {
//        categoryDao.insertCategory(categoryModel)
//    }
//
//    suspend fun updateCategory(categoryModel: CategoriesModel) {
//        categoryDao.updateCategory(categoryModel)
//    }
//
//    suspend fun deleteCategory(categoryModel: CategoriesModel) {
//        categoryDao.deleteCategory(categoryModel)
//    }
//
//    suspend fun deleteAllCategories() {
//        categoryDao.deleteAllCategories()
//    }
}