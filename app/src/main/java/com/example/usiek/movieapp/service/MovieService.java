package com.example.usiek.movieapp.service;

import com.example.usiek.movieapp.model.Movie;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by usiek on 07.07.2017.
 */

public class MovieService {
    public interface MovieApi {

        @GET("get/bSciNrOTCa")
        Observable<List<Movie>> getMovie(@Query("indent") int indent);
    }
}
