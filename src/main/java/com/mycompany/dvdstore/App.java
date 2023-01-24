package com.mycompany.dvdstore;

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
        System.out.println("Movie title please !");
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();

        System.out.println("Movie genre please !");
        Scanner sc2 = new Scanner(System.in);
        String genre = sc2.nextLine();

        Movie movie = new Movie();
        movie.setGenre(genre);
        movie.setTitle(title);
        MovieService service = new MovieService();
        service.registerMovie(movie);
    }
}
