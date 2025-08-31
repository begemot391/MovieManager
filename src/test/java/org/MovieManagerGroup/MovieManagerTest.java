package org.MovieManagerGroup;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class MovieManagerTest {

    public MovieManager manager = new MovieManager();
    Films testFilm1 = new Films( 1, 2001, 95, "TestFilm1", "http://testurl1.com");
    Films testFilm2 = new Films( 2, 2002, 96, "TestFilm2", "http://testurl2.com");
    Films testFilm3 = new Films( 3, 2003, 97, "TestFilm3", "http://testurl3.com");
    Films testFilm4 = new Films( 4, 2004, 98, "TestFilm4", "http://testurl4.com");
    Films testFilm5 = new Films( 5, 2005, 99, "TestFilm5", "http://testurl5.com");
    Films testFilm6 = new Films( 5, 2006, 99, "TestFilm6", "http://testurl6.com");
    Films testFilm7 = new Films( 5, 2007, 99, "TestFilm7", "http://testurl7.com");




    @Test
    public void testEmptyList() { // Проверяем пустой массив с фильмами.


        Films[] exp = {};
        Films[] act = manager.getAllFilmsFromFirst();

        Assertions.assertArrayEquals( exp, act);
    }

    @Test
    public void testGetMovieListFromFirst() { // Получить список фильмов, начиная с первого, без ограничений.

        manager.addFilm(testFilm1);
        manager.addFilm(testFilm2);
        manager.addFilm(testFilm3);
        manager.addFilm(testFilm4);
        manager.addFilm(testFilm5);


        Films[] exp = {testFilm1, testFilm2, testFilm3, testFilm4, testFilm5};
        Films[] act = manager.getAllFilmsFromFirst();

        Assertions.assertArrayEquals( exp, act);
    }

    @Test
    public void testGetMovieListFromLast() { // Получить полный список фильмов, начиная с последнего, без ограничений.

        manager.addFilm(testFilm1);
        manager.addFilm(testFilm2);
        manager.addFilm(testFilm3);
        manager.addFilm(testFilm4);
        manager.addFilm(testFilm5);

        Films[] exp = {testFilm5, testFilm4, testFilm3, testFilm2, testFilm1};
        Films[] act = manager.getFilmsFromLast();

        Assertions.assertArrayEquals( exp, act );
    }

    @Test
    public void testGetMovieByCount5FromFirst() { // Получить список фильмов, начиная с первого, ограничение счётчика, по умолчанию 5.

        manager.addFilm(testFilm1);
        manager.addFilm(testFilm2);
        manager.addFilm(testFilm3);
        manager.addFilm(testFilm4);
        manager.addFilm(testFilm5);
        manager.addFilm(testFilm6);
        manager.addFilm(testFilm7);

        Films[] exp = {testFilm1, testFilm2, testFilm3, testFilm4, testFilm5};
        Films[] act = manager.getFilmsByCountFromFirst();

        Assertions.assertArrayEquals( exp, act );
    }

    @Test
    public void testGetMovieByCount7FromFirst() { // Получить список фильмов, начиная с первого, ограничение счётчика новое 7.

        MovieManager manager = new MovieManager(7);

        manager.addFilm(testFilm1);
        manager.addFilm(testFilm2);
        manager.addFilm(testFilm3);
        manager.addFilm(testFilm4);
        manager.addFilm(testFilm5);
        manager.addFilm(testFilm6);
        manager.addFilm(testFilm7);

        Films[] exp = {testFilm1, testFilm2, testFilm3, testFilm4, testFilm5, testFilm6, testFilm7};
        Films[] act = manager.getFilmsByCountFromFirst();

        Assertions.assertArrayEquals( exp, act );
    }

    @Test
    public void testGetMovieByCount3FromFirst() { // Получить список фильмов, начиная с первого, ограничение счётчика новое 3.

        MovieManager manager = new MovieManager(3);

        manager.addFilm(testFilm1);
        manager.addFilm(testFilm2);
        manager.addFilm(testFilm3);
        manager.addFilm(testFilm4);
        manager.addFilm(testFilm5);
        manager.addFilm(testFilm6);
        manager.addFilm(testFilm7);

        Films[] exp = {testFilm1, testFilm2, testFilm3 };
        Films[] act = manager.getFilmsByCountFromFirst();

        Assertions.assertArrayEquals( exp, act );
    }

    @Test
    public void testGetMovieByCount7FromLast() {// Получить список фильмов, начиная с последнего, ограничение счётчика новое 7.

        MovieManager manager = new MovieManager(7);

        manager.addFilm(testFilm1);
        manager.addFilm(testFilm2);
        manager.addFilm(testFilm3);
        manager.addFilm(testFilm4);
        manager.addFilm(testFilm5);
        manager.addFilm(testFilm6);
        manager.addFilm(testFilm7);

        Films[] exp = {testFilm7, testFilm6, testFilm5, testFilm4, testFilm3, testFilm2, testFilm1};
        Films[] act = manager.getFilmsFromLastByCount();

        Assertions.assertArrayEquals( exp, act );
    }

    @Test
    public void testGetMovieByCount3FromLast() {// Получить список фильмов, начиная с последнего, ограничение счётчика новое 3.

        MovieManager manager = new MovieManager(3);

        manager.addFilm(testFilm1);
        manager.addFilm(testFilm2);
        manager.addFilm(testFilm3);
        manager.addFilm(testFilm4);
        manager.addFilm(testFilm5);
        manager.addFilm(testFilm6);
        manager.addFilm(testFilm7);

        Films[] exp = {testFilm7, testFilm6, testFilm5 };
        Films[] act = manager.getFilmsFromLastByCount();

        Assertions.assertArrayEquals( exp, act );
    }

    @Test
    public void testGetMovieByCount1FromFirst() { // Получить список фильмов, начиная с первого, ограничение счётчика новое 1.

        MovieManager manager = new MovieManager(1);

        manager.addFilm(testFilm1);
        manager.addFilm(testFilm2);
        manager.addFilm(testFilm3);
        manager.addFilm(testFilm4);
        manager.addFilm(testFilm5);
        manager.addFilm(testFilm6);
        manager.addFilm(testFilm7);

        Films[] exp = {testFilm1};
        Films[] act = manager.getFilmsByCountFromFirst();

        Assertions.assertArrayEquals( exp, act );
    }

    @Test
    public void testGetMovieByCount1FromLast() {// Получить список фильмов, начиная с последнего, ограничение счётчика новое 1.

        MovieManager manager = new MovieManager(1);

        manager.addFilm(testFilm1);
        manager.addFilm(testFilm2);
        manager.addFilm(testFilm3);
        manager.addFilm(testFilm4);
        manager.addFilm(testFilm5);
        manager.addFilm(testFilm6);
        manager.addFilm(testFilm7);

        Films[] exp = {testFilm7};
        Films[] act = manager.getFilmsFromLastByCount();

        Assertions.assertArrayEquals( exp, act );
    }
}
