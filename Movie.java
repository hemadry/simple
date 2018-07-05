package com.example.hemadry.project004;

public class Movie {
    private String movieName;
    private String movieCatagorie;
    private int image;

    public Movie(String movieName, String movieCatagorie, int image) {
        this.movieName = movieName;
        this.movieCatagorie = movieCatagorie;
        this.image = image;
    }

    public Movie() {
    }

    public String getMovieName() {
        return movieName;
    }

    public String getMovieCatagorie() {
        return movieCatagorie;
    }

    public int getImage() {
        return image;
    }
}
