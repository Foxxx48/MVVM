package com.fox.mvvm.dataSourseIMPL

import androidx.lifecycle.LiveData
import com.fox.mvvm.localDB.CategoriesDAO
import com.fox.mvvm.dataSource.CategoriesDataSource
import com.fox.mvvm.models.CategoriesModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class CategoriesDataSourceIMPL (private val dao: CategoriesDAO):
    CategoriesDataSource {
    override fun insert(categoriesModel: CategoriesModel) {
        CoroutineScope(Dispatchers.IO).launch {
            dao.insertCategory(categoriesModel)}
    }

    override fun loadCategories(): LiveData<List<CategoriesModel>> {
        return dao.loadCategories()
    }

    override suspend fun clear() {
        CoroutineScope(Dispatchers.IO).launch {
            dao.clear()}
    }

}