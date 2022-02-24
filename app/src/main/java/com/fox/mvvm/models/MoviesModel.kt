package com.fox.mvvm.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "movie_data_table")
 class MoviesModel (

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "movie_id")
    var id : Int,

    @ColumnInfo(name = "movie_name")
    var name : String,

    @ColumnInfo(name = "movie_category")
    var category : String,

    @ColumnInfo(name = "movie_rating")
    var rating : String,
)