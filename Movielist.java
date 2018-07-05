package com.example.hemadry.project004;

import java.util.ArrayList;
import java.util.List;

public final class Movielist {

    public static List<Movie>generateMovie()
    {
        List<Movie>movies= new ArrayList<>();
        movies.add(new Movie("Adventure","Action",R.drawable.ss));
        movies.add(new Movie("Rambo","Adventure",R.drawable.bv));
        movies.add(new Movie("Wonder Woman"," Comedy",R.drawable.ds));
        movies.add(new Movie("Solo Movie ","Animation",R.drawable.rr));
        movies.add(new Movie("Solo Movie ","Animation",R.drawable.aa));

        return movies;
    }
}
