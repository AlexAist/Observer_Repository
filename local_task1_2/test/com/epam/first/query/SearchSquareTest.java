package com.epam.first.query;

import com.epam.first.entity.Point;
import com.epam.first.entity.Triangle;
import com.epam.first.exception.BasicException;
import org.testng.annotations.Test;


import static org.testng.Assert.*;

public class SearchSquareTest {

    private SearchSquare search = new SearchSquare();

    @Test
    public void testSearch() throws BasicException {
        search.setMinSquare(10.0);
        search.setMaxSquare(15.3);
        Point point4 = new Point(7.0, 4.0);
        Point point5 = new Point(3.0, 1.0);
        Point point6 = new Point(5.0, 8.0);
        Triangle triangle = new Triangle(point4, point5, point6);
        assertTrue(search.search(triangle));
    }
}