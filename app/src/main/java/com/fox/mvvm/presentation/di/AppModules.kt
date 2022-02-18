package com.fox.mvvm.presentation.di

import androidx.room.Room
import com.fox.mvvm.dataSource.CategoriesApiDataSource
import com.fox.mvvm.dataSource.CategoriesDataSource
import com.fox.mvvm.dataSourseIMPL.CategoriesApiDataSourceIMPL
import com.fox.mvvm.dataSourseIMPL.CategoriesDataSourceIMPL
import com.fox.mvvm.domain.repositoryDomain.CategoriesCall
import com.fox.mvvm.domain.useCase.CategoriesUseCase
import com.fox.mvvm.localDB.LocalDataBase
import com.fox.mvvm.presentation.CategoriesViewModel
import com.fox.mvvm.repositories.CategoriesRepository
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val moduleCategories = module{

    single {
        Room.databaseBuilder(androidContext(), LocalDataBase::class.java,
            "localDataBase").build()
    }

    single { get<LocalDataBase>().categoriesDao }


    single<CategoriesDataSource> {
        CategoriesDataSourceIMPL(
            get()
        )
    }

    single<CategoriesApiDataSource> {
        CategoriesApiDataSourceIMPL(
            get()
        )
    }

    single<CategoriesCall> { CategoriesRepository(get(),get()) }

    single { CategoriesUseCase(get()) }

    viewModel { CategoriesViewModel(get()) }

}