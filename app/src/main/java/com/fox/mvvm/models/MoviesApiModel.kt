package com.fox.mvvm.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class MoviesApiModel (
    @SerializedName("id") @Expose
    var id: Int? = null,
    @SerializedName("name") @Expose
    var name: String? = null,
    @SerializedName("category") @Expose
    var category: String? = null,
    @SerializedName("rating") @Expose
    var rating: String? = null,
    @SerializedName("image") @Expose
    var image: String? = null
)