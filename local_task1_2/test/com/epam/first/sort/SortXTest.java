package com.epam.first.sort;

import com.epam.first.entity.Point;
import com.epam.first.entity.Triangle;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SortXTest {

    private SortX sortX = new SortX();

    @Test
    public void testCompare() {
        Point point1 = new Point(1.0, 4.0);
        Point point2 = new Point(3.0, 6.0);
        Point point3 = new Point(2.0, 9.0);
        Point point4 = new Point(7.0, 4.0);
        Point point5 = new Point(3.0, 1.0);
        Point point6 = new Point(5.0, 8.0);
        Triangle triangle1 = new Triangle(point1, point2, point3);
        Triangle triangle2 = new Triangle(point4, point5, point6);
        assertEquals(-1, sortX.compare(triangle1, triangle2));
    }

    @Test
    public void testCompare1() {
        Point point1 = new Point(7.0, 4.0);
        Point point2 = new Point(3.0, 6.0);
        Point point3 = new Point(2.0, 9.0);
        Point point4 = new Point(1.0, 4.0);
        Point point5 = new Point(3.0, 1.0);
        Point point6 = new Point(5.0, 8.0);
        Triangle triangle1 = new Triangle(point1, point2, point3);
        Triangle triangle2 = new Triangle(point4, point5, point6);
        assertEquals(1, sortX.compare(triangle1, triangle2));
    }
}