package com.sample.app.data.datasource.remote

import com.sample.app.data.entites.Character
import com.sample.app.data.entites.CharacterList
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface CharacterService {
    @GET("character")
    suspend fun getAllCharacters() : Response<CharacterList>

    @GET("character/{id}")
    suspend fun getCharacter(@Path("id")id: Int) : Response<Character>
}