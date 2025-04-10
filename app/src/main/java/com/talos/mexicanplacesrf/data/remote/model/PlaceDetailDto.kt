package com.talos.mexicanplacesrf.data.remote.model

import com.google.gson.annotations.SerializedName

data class PlaceDetailDto(
    @SerializedName("title")
    var title: String? = null,
    @SerializedName("image")
    var image: String? = null,
    @SerializedName("state")
    var state: String? = null,
    @SerializedName("attractions")
    var attractions: String? = null,
    @SerializedName("dish")
    var dish: String? = null,
    @SerializedName("abstract")
    var abstract: String? = null

)
