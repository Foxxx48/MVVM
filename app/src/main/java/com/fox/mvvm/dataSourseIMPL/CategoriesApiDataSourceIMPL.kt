package com.fox.mvvm.dataSourseIMPL

import android.content.Context
import android.widget.Toast
import com.fox.mvvm.data.api.ApiClient
import com.fox.mvvm.dataSource.CategoriesApiDataSource
import com.fox.mvvm.dataSource.CategoriesDataSource
import com.fox.mvvm.models.CategoriesModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class CategoriesApiDataSourceIMPL (private val categoriesDataSource: CategoriesDataSource):
    CategoriesApiDataSource {
    override fun startMigration (context: Context) {

        val call = ApiClient.instance?.api?.loadCategoriesApi()
        call?.enqueue(object: Callback<ArrayList<CategoriesModel>> {
            override fun onResponse(
                call: Call<ArrayList<CategoriesModel>>,
                response: Response<ArrayList<CategoriesModel>>
            ) {


                var loadCategories: ArrayList<CategoriesModel>? = null

                loadCategories?.clear()

                loadCategories = (response.body() as ArrayList<CategoriesModel>?)!!

                for (audit in loadCategories) {

                    audit.id?.let {
                        CategoriesModel(
                            it,
                            audit.name.toString()
//                            audit.image.toString()
                        )
                    }?.let {
                        categoriesDataSource.insert(
                            it
                        )
                    }

                }

                Toast.makeText(context, "ЗАГРУЗКА", Toast.LENGTH_SHORT).show()


            }

            override fun onFailure(call: Call<ArrayList<CategoriesModel>>, t: Throwable) {
                Toast.makeText(context, "ОШИБКА! ВКЛЮЧИТЕ ИНТЕРНЕТ!", Toast.LENGTH_SHORT).show()

            }
        })

    }

}