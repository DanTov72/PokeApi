package com.example.pokeapi.data.repositories

import com.example.pokeapi.base.BaseRepository
import com.example.pokeapi.data.remote.apiserfices.PokemonApiService
import javax.inject.Inject

class PokemonRepository @Inject constructor(private val service: PokemonApiService) :
    BaseRepository() {

    fun fetchPokemon() = doRequest {
        service.fetchPokemonName()
    }
}