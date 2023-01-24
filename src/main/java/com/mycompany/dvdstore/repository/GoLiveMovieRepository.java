package com.mycompany.dvdstore.repository;

import com.mycompany.dvdstore.entity.Movie;

import java.io.FileWriter;
import java.io.IOException;

public class GoLiveMovieRepository {

    public void add(Movie movie){
        String text = "";
        FileWriter writer;
        try{
            writer=new FileWriter("C:\\Users\\P003486\\Desktop\\spring-workspace\\__repos\\movies.txt",true);
            text = movie.getTitle()+";"+movie.getGenre();
            writer.write(text+"\n");
            writer.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
