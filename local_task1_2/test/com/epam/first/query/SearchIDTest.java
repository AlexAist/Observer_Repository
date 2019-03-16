package com.epam.first.query;

import com.epam.first.entity.AbstractEntity;
import com.epam.first.entity.Point;
import com.epam.first.entity.Triangle;
import com.epam.first.exception.BasicException;
import com.epam.first.repository.TriangleRepository;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;

public class SearchIDTest {

    private TriangleRepository repository = TriangleRepository.getRepository();
    private SearchID searchID = new SearchID();

    @BeforeClass
    public void init(){
        Point point1 = new Point(1.0, 4.0);
        Point point2 = new Point(3.0, 6.0);
        Point point3 = new Point(2.0, 9.0);
        Point point4 = new Point(7.0, 4.0);
        Point point5 = new Point(3.0, 1.0);
        Point point6 = new Point(5.0, 8.0);
        Point point7 = new Point(1.0, 4.0);
        Point point8 = new Point(3.0, 6.0);
        Point point9 = new Point(2.0, 9.0);
        Point point10 = new Point(7.0, 4.0);
        Point point11 = new Point(3.0, 1.0);
        Point point12 = new Point(5.0, 8.0);
        Triangle triangle1 = new Triangle(point1, point2, point3);
        Triangle triangle2 = new Triangle(point4, point5, point6);
        Triangle triangle3 = new Triangle(point7, point8, point9);
        Triangle triangle4 = new Triangle(point10, point11, point12);
        Triangle triangle5 = new Triangle(point1, point6, point10);
        repository.add(triangle1);
        repository.add(triangle2);
        repository.add(triangle3);
        repository.add(triangle4);
        repository.add(triangle5);
    }

    @Test
    public void testSearch() throws BasicException {
        Point point1 = new Point(3.0, 6.0);
        Point point2 = new Point(5.0, 8.0);
        Point point3 = new Point(5.0, 8.0);
        Triangle triangle = new Triangle(point1, point2, point3);
        repository.add(triangle);
        searchID.setEntityID(7);
        assertTrue(searchID.search(triangle));
    }
}