package com.fox.mvvm.localDB

import androidx.lifecycle.LiveData
import androidx.room.*
import com.fox.mvvm.models.MoviesApiModel

@Dao
interface MoviesDAO {

//    @Insert
//    suspend fun insertMovie(moviesApiModel: MoviesApiModel)
//
//    @Update
//    suspend fun updateMovie(moviesApiModel: MoviesApiModel)
//
//    @Delete
//    suspend fun deleteMovie(moviesApiModel: MoviesApiModel)
//
//    @Query("DELETE FROM movie_data_table")
//    suspend fun deleteAllMovies()
//
//    @Query("SELECT * FROM movie_data_table")
//    fun getAllMovies(): LiveData<List<MoviesApiModel>>

//    @Query("SELECT * FROM movie_data_table WHERE movie_category = :nameCategory AND movie_duration = :movieDuration")
//    fun getFilter(nameCategory:String, movieDuration:String): LiveData<List<MovieModel>>
//
//    @Query("SELECT * FROM movie_data_table WHERE movie_category = 'ЭКШН' AND movie_duration = '120'")
//    fun getMovie(): LiveData<List<MovieModel>>
//
//    @Query("SELECT * FROM movie_data_table WHERE movie_category = :nameCategory OR movie_duration = :movieDuration")
//    fun getThreeVariant(nameCategory:String, movieDuration:String): LiveData<List<MovieModel>>
}