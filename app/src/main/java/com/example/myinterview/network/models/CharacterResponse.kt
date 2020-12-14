package com.example.myinterview.network.models

import com.google.gson.annotations.SerializedName

data class CharacterResponse(
    @SerializedName("info")
    val info: Info,

    @SerializedName("results")
    val results: List<Character>
)

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