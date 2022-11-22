package com.example.pokeapi.data.remote.apiserfices

import com.example.pokeapi.models.PokemonModel
import com.example.pokeapi.models.PokemonResponse
import retrofit2.http.GET

interface PokemonApiService {

    @GET("pokemon")
    suspend fun fetchPokemonName(): PokemonResponse<PokemonModel>

}