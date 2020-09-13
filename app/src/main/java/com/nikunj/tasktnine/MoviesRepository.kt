package com.nikunj.tasktnine

class MoviesRepository(private val api: MoviesApi) : SafeApiRequest() {

    suspend fun getMovies() = apiRequest { api.getMovies() }
}