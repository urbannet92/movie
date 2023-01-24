package com.mycompany.dvdstore.service;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.repository.GoLiveMovieRepository;
import com.mycompany.dvdstore.repository.MovieRepository;

import java.util.ArrayList;
import java.util.List;

public class MovieService {

    public void registerMovie(Movie movie){
        MovieRepository movieRepository = new MovieRepository();
        movieRepository.add(movie);
    }

    public void registerMovieInFile(Movie movie){
        GoLiveMovieRepository goLiveMovieRepository = new GoLiveMovieRepository();
        goLiveMovieRepository.add(movie);
    }
}
