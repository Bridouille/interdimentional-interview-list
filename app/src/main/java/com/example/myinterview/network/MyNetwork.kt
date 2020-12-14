package com.example.myinterview.network

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

object MyNetwork {

    private const val BASE_URL = "https://rickandmortyapi.com/"

    private var endpoint: RickAndMortyEndpoint? = null

    fun getEndpoint() : RickAndMortyEndpoint {
        if (endpoint == null) {
            endpoint = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .client(
                    OkHttpClient.Builder()
                        .addInterceptor(
                            HttpLoggingInterceptor().apply {
                                level = HttpLoggingInterceptor.Level.BODY
                            }
                        )
                        .build()

                )
                .build()
                .create(RickAndMortyEndpoint::class.java)
        }
        return endpoint!!
    }
}