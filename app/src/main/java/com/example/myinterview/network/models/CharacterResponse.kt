package com.example.myinterview.network.models

import com.google.gson.annotations.SerializedName

/**
 * The docs for the api are here: https://rickandmortyapi.com/
 */

// The complete response (paginated)
data class CharacterResponse(
    @SerializedName("info")
    val info: Info,

    @SerializedName("results")
    val results: List<Character>
)

//The information about the page you are on
data class Info(
    @SerializedName("count")
    val count: Long,

    @SerializedName("pages")
    val pages: Long,

    @SerializedName("next")
    val next: String?,

    @SerializedName("prev")
    val prev: String?
)

// Character data
data class Character(
    @SerializedName("id")
    val id: Long,

    @SerializedName("name")
    val name: String,

    @SerializedName("species")
    val species: String,

    @SerializedName("image")
    val image: String,

    @SerializedName("gender")
    val gender: String
)