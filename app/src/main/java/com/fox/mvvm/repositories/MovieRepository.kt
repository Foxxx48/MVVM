package com.fox.mvvm.repositories

import androidx.lifecycle.LiveData
import com.fox.mvvm.localDB.MoviesDAO
import com.fox.mvvm.models.MoviesModel

class MovieRepository (private val movieDAO: MoviesDAO){
    val movies = movieDAO.getAllMovies()

//    fun getFilter (nameCategory:String, durationMovie:String):
//            LiveData<List<MoviesModel>> {
//        return movieDAO.getFilter(nameCategory, durationMovie)
//    }
//
//
//    suspend fun insertMovie(moviesModel: MoviesModel){
//        movieDAO.insertMovie(moviesModel)
//    }
//
//    suspend fun updateMovie(moviesModel: MoviesModel){
//        movieDAO.updateMovie(moviesModel)
//    }
//
//    suspend fun deleteMovie(moviesModel: MoviesModel) {
//        movieDAO.deleteMovie(moviesModel)
//    }
//
//    suspend fun deleteAllMovies(){
//        movieDAO.deleteAllMovies()
//    }

}