package com.fox.mvvm.domain.repositoryDomain

import android.content.Context
import androidx.lifecycle.LiveData
import com.fox.mvvm.models.CategoriesModel

interface CategoriesCall {
    fun loadCategories(): LiveData<List<CategoriesModel>>

    suspend fun startMigration(context: Context)

}