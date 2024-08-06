package com.ek.tvseries.data.remote.dto


import com.ek.tvseries.domain.model.CastDetails
import com.google.gson.annotations.SerializedName

data class GuestStar(
    @SerializedName("adult")
    val adult: Boolean,
    @SerializedName("character")
    val character: String,
    @SerializedName("credit_id")
    val creditId: String,
    @SerializedName("gender")
    val gender: Int,
    @SerializedName("id")
    val id: Int,
    @SerializedName("known_for_department")
    val knownForDepartment: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("order")
    val order: Int,
    @SerializedName("original_name")
    val originalName: String,
    @SerializedName("popularity")
    val popularity: Double,
    @SerializedName("profile_path")
    val profilePath: String
)

fun GuestStar.toCastDetail() = CastDetails(
    name = originalName,
    profileImage = profilePath,
    job = character
)