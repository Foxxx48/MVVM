package com.fox.mvvm.domain.useCase

import android.content.Context
import androidx.lifecycle.LiveData
import com.fox.mvvm.domain.repositoryDomain.CategoriesCall
import com.fox.mvvm.models.CategoriesModel

class CategoriesUseCase (private val categoriesCall: CategoriesCall) {


    fun loadCategories(): LiveData<List<CategoriesModel>> {

        return categoriesCall.loadCategories()

    }

    suspend fun startMigration (context: Context) {

        categoriesCall.startMigration(context)

    }

}