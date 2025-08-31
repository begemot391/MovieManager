package org.MovieManagerGroup;

public class Films {

    private int id;
    private int releaseYear;
    private int movieDuration;
    private String movieName;
    private String moviePosterUrl;

    // Конструкторы
    public Films() {
    }

    public Films(int id, int releaseYear, int movieDuration, String movieName, String moviePosterUrl) {
        this.id = id;
        this.releaseYear = releaseYear;
        this.movieDuration = movieDuration;
        this.movieName = movieName;
        this.moviePosterUrl = moviePosterUrl;
    }

    // Геттеры и сеттеры
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getMovieDuration() {
        return movieDuration;
    }

    public void setMovieDuration(int movieDuration) {
        this.movieDuration = movieDuration;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMoviePosterUrl() {
        return moviePosterUrl;
    }

    public void setMoviePosterUrl(String moviePosterUrl) {
        this.moviePosterUrl = moviePosterUrl;
    }
}
