package com.example.myinterview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.myinterview.network.MyNetwork
import com.example.myinterview.network.models.Character
import com.example.myinterview.network.models.CharacterResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    /**
     * Tasks:
     * 1) Load a list of "Male" characters using MyNetwork and put them in a list displaying:
     * - Name, Species, Image
     * => https://rickandmortyapi.com/documentation/#rest
     *
     * 2) Create a "detail view" showing more information when we click on a character
     * in the above list
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
}