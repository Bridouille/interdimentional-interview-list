package com.example.myinterview.network

import com.example.myinterview.network.models.Character
import com.example.myinterview.network.models.CharacterResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface RickAndMortyEndpoint {

    @GET("api/character")
    fun getCharacters() : Call<CharacterResponse>

    @GET("api/character/{id}")
    fun getCharacterById(@Path("id") id: Long) : Call<Character>
}