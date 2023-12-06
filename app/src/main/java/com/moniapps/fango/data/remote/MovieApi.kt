package com.moniapps.fango.data.remote

interface MovieApi{
    suspend fun getMoviesList()
}