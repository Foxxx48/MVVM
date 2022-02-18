package com.fox.mvvm.data.api

import com.fox.mvvm.models.CategoriesApiModel
import com.fox.mvvm.models.MoviesApiModel
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.*

interface ApiInterface {
    @FormUrlEncoded
    @POST("insertCategory.php")
    fun insertCategory(
        @Field("name") name: String?
    ): Call<ResponseBody?>?

    @FormUrlEncoded
    @POST("insertMovie.php")
    fun insertMovie(
        @Field("name") name: String?,
        @Field("category") category: String?,
        @Field("rating") rating: String?,
        @Field("image") image: String?
    ): Call<ResponseBody?>?


    @FormUrlEncoded
    @POST("updateCategory.php")
    fun updateCategory(
        @Field("id") id: Int,
        @Field("name") name: String?
    ): Call<ResponseBody?>?

    @FormUrlEncoded
    @POST("updateMovie.php")
    fun updateMovie(
        @Field("id") id: Int,
        @Field("name") name: String?,
        @Field("category") category: String?,
        @Field("rating") rating: String?,
        @Field("image") image: String?
    ): Call<ResponseBody?>?

    @FormUrlEncoded
    @POST("deleteCategory.php")
    fun deleteCategory(
        @Field("id") id: Int
    ): Call<ResponseBody?>?

    @FormUrlEncoded
    @POST("deleteMovie.php")
    fun deleteMovie(
        @Field("id") id: Int
    ): Call<ResponseBody?>?

    @DELETE("clearCategories.php")
    fun clearCategories(): Call<ResponseBody?>?

    @DELETE("clearMovies.php")
    fun clearMovies(): Call<ResponseBody?>?

    @GET("getCategory.php")
    fun loadCategoriesApi(): Call<ArrayList<CategoriesApiModel>>

    @GET("getMovie.php")
    fun getMovie(): Call<ArrayList<MoviesApiModel>>

    @GET("getMovieFilter.php")
    fun getMovieFilter(@Query("category") category: String, @Query("rating") rating: String):
            Call<ArrayList<MoviesApiModel>>

}