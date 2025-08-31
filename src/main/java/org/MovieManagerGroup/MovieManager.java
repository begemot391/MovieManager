package org.MovieManagerGroup;



public class MovieManager {

    private Films[] filmsList = new Films[0];
    private int movieCount;

    public MovieManager() {
        this.movieCount = 5;
    }

    public MovieManager( int newMovieCount ) {

        this.movieCount = newMovieCount;
    }

    public void addFilm( Films film ) {

        Films[] tmpForAdd = new Films[ filmsList.length + 1 ];

        for ( int i = 0; i < filmsList.length; i ++ ) {
            tmpForAdd[i] = filmsList[i];
        }
        tmpForAdd[tmpForAdd.length - 1] = film;
        filmsList = tmpForAdd;
    }

    public Films[] getAllFilmsFromFirst() {
        return filmsList;
    }

    public Films[] getFilmsByCountFromFirst() {

        Films[] filmsByCount = new Films[movieCount];
        Films[] listAllMovies =  getAllFilmsFromFirst();
        for ( int i = 0; i < movieCount; i++ ){
            filmsByCount[i] = listAllMovies[i];
        }

        return filmsByCount;
    }

    public Films[] getFilmsFromLast() {

        Films[] originalList = getAllFilmsFromFirst();
        Films[] backwardList = new Films[originalList.length];

        for ( int i = 0; i < originalList.length; i++ ) {

            backwardList[i] = originalList[originalList.length - 1 - i];
        }

        return backwardList;
    }

    public Films[] getFilmsFromLastByCount() {

        Films[] originalList = getFilmsFromLast();
        Films[] backwardList = new Films[movieCount];

        for ( int i = 0; i < movieCount; i++ ) {

            backwardList[i] = originalList[i];
        }

        return backwardList;
    }
}
