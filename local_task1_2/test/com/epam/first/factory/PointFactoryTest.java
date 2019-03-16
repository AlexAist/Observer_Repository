package com.epam.first.factory;

import com.epam.first.entity.Point;
import com.epam.first.exception.BasicException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;

public class PointFactoryTest {

    private PointFactory pointFactory = new PointFactory();

    @DataProvider
    private Object[][] initPointArr() {
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
                {list, new Point[]{point1, point2, point3, point4, point5, point6}},
                {emptyList, new Point[]{}}
        };
    }

    @Test
    public void testCreateDetail() {
        assertEquals(new Point(), pointFactory.createDetail());
    }

    @DataProvider
    private Object[][] initPoint() {
        return new Object[][]{
                {new double[]{1.0, 4.0}, new Point(1.0, 4.0)}
        };
    }

    @Test(dataProvider = "initPoint")
    public void testCreateDetail1(double[] coordinates, Point expected) {
        assertEquals(expected, pointFactory.createDetail(coordinates));
    }

    @Test(dataProvider = "initPointArr")
    public void testCreateDetails(List<String> list, Point[] expected) throws BasicException {
        assertEquals(expected, pointFactory.createDetails(list));
    }
}