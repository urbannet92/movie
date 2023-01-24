package com.mycompany.dvdstore;

import com.mycompany.dvdstore.controller.GoLiveMovieController;
import com.mycompany.dvdstore.controller.MovieController;
import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.service.MovieService;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args ) {
        /**
         * save in file
         */
        GoLiveMovieController goLiveMovieController = new GoLiveMovieController();
        goLiveMovieController.addUsingConsole();

        /**
         * Console
         */
//        MovieController movieController = new MovieController();
//        movieController.addUsingConsole();


    }
}
