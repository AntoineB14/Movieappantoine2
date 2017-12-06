package com.example.eilco.Movieappantoine.api;

import com.example.eilco.Movieappantoine.model.MoviesResponse;
import com.example.eilco.Movieappantoine.model.TrailerResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;


public interface Service {

    @GET ("movie/popular")
    Call<MoviesResponse> getPopularMovies(@Query("edfa873ad221ae5dc895172907650d1a") String apiKey);

    @GET ("movie/top_rated")
    Call<MoviesResponse> getTopRatedMovies(@Query("edfa873ad221ae5dc895172907650d1a") String apiKey);

    @GET("movie/{movie_id}/videos")
    Call<TrailerResponse> getMovieTrailer(@Path("movie_id") int id, @Query("edfa873ad221ae5dc895172907650d1a") String apiKey);

}

