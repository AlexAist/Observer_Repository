package com.epam.first.repository;

import com.epam.first.entity.AbstractEntity;
import com.epam.first.entity.Point;
import com.epam.first.entity.Triangle;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.*;

public class TriangleRepositoryTest {

    private TriangleRepository triangleRepository = TriangleRepository.getRepository();
    private List<AbstractEntity> list = triangleRepository.getTriangleList();

    @BeforeClass
    public void init(){
        Point point1 = new Point(1.0, 4.0);
        Point point2 = new Point(3.0, 6.0);
        Point point3 = new Point(2.0, 9.0);
        Point point4 = new Point(7.0, 4.0);
        Point point5 = new Point(3.0, 1.0);
        Point point6 = new Point(5.0, 8.0);
        Triangle triangle1 = new Triangle(point1, point2, point3);
        Triangle triangle2 = new Triangle(point4, point5, point6);
        list.add(triangle1);
        list.add(triangle2);
    }

    @Test
    public void testAdd() {
        Point point1 = new Point(1.3, 4.2);
        Point point2 = new Point(3.7, 6.3);
        Point point3 = new Point(2.7, 9.5);
        Triangle triangle = new Triangle(point1, point2, point3);
        assertTrue(triangleRepository.add(triangle));
    }

    @Test
    public void testRemove() {
        Point point1 = new Point(1.0, 4.0);
        Point point2 = new Point(3.0, 6.0);
        Point point3 = new Point(2.0, 9.0);
        Triangle triangle = new Triangle(point1, point2, point3);
        assertTrue(triangleRepository.remove(triangle));
    }

    @Test
    public void testUpdate() {
        Point point1 = new Point(1.7, 4.3);
        Point point2 = new Point(5.0, 6.6);
        Point point3 = new Point(8.0, 9.5);
        Triangle triangle = new Triangle(point1, point2, point3);
        int index = 1;
        assertTrue(triangleRepository.update(triangle, index));
    }
}