package com.epam.first.factory;

import com.epam.first.entity.Point;
import com.epam.first.entity.Triangle;
import com.epam.first.exception.BasicException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;

public class TriangleFactoryTest {

    private TriangleFactory factory = new TriangleFactory();

    @DataProvider
    private Object[][] initForOneObj() {
        return new Object[][]{
                {new double[]{1.0, 4.0, 3.0, 6.0, 2.0, 9.0},
                        new Triangle(new Point(1.0, 4.0), new Point(3.0, 6.0), new Point(2.0, 9.0))}
        };
    }

    @Test
    public void testCreateDetail() {
        assertEquals(new Triangle(), factory.createDetail());
    }

    @Test(dataProvider = "initForOneObj")
    public void testCreateDetail1(double[] coordinates, Triangle expected) {
        assertEquals(expected, factory.createDetail(coordinates));
    }

    @DataProvider
    private Object[][] initForArrOfObj() {
        List<String> list = new ArrayList<>();
        List<String> emptyList = new ArrayList<>();
        list.add("1.0 4.0 3.0 6.0 2.0 9.0");
        list.add("7.0 4.0 3.0 1.0 5.0 8.0");
        Point point1 = new Point(1.0, 4.0);
        Point point2 = new Point(3.0, 6.0);
        Point point3 = new Point(2.0, 9.0);
        Point point4 = new Point(7.0, 4.0);
        Point point5 = new Point(3.0, 1.0);
        Point point6 = new Point(5.0, 8.0);

        return new Object[][]{
                {list, new Triangle[]{new Triangle(point1, point2, point3), new Triangle(point4, point5, point6)}},
                {emptyList, new Triangle[]{}}
        };
    }

    @Test(dataProvider = "initForArrOfObj")
    public void testCreateDetails(List<String> list, Triangle[] expected) throws BasicException {
        assertEquals(expected, factory.createDetails(list));
    }
}