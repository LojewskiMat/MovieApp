package com.example.usiek.movieapp.model;

/**
 * Created by usiek on 07.07.2017.
 */

public class Movie {

/*
"rating": 7.7999999999999998,
    "story": "When Tony Stark and Bruce Banner try to jump-start a dormant peacekeeping program called Ultron, things go horribly wrong and it's up to Earth's Mightiest Heroes to stop the villainous Ultron from enacting his terrible plans.",
    "movie": "Avengers",
    "image": "https://jsonparsingdemo-cec5b.firebaseapp.com/jsonData/images/avengers.jpg",
    "year": 2012,
    "director": "Joss Whedon",
    "tagline": "A new age begins",
    "duration": "141 min"
 */

    double rating = 0;
    String story = null;
    String movie = null;
    String image = null;
    int year = 0;
    String director = null;
    String tagline = null;
    String duration = null;

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getStory() {
        return story;
    }

    public void setStory(String story) {
        this.story = story;
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getTagline() {
        return tagline;
    }

    public void setTagline(String tagline) {
        this.tagline = tagline;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}
