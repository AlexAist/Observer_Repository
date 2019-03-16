package com.epam.first.query;

import com.epam.first.entity.Point;
import com.epam.first.entity.Triangle;
import com.epam.first.exception.BasicException;
import com.epam.first.warehouse.TriangleParam;
import com.epam.first.warehouse.Warehouse;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.HashMap;

import static org.testng.Assert.*;

public class SearchPerimeterTest {

    private Warehouse warehouse = Warehouse.getWarehouse();
    private SearchPerimeter search = new SearchPerimeter();

    @BeforeClass
    public void init(){
        HashMap<Long, TriangleParam> map = new HashMap<>();
        map.put(1L, new TriangleParam(3.0, 5.2));
        map.put(2L, new TriangleParam(4.0, 6.2));
        map.put(3L, new TriangleParam(5.0, 7.2));
        map.put(4L, new TriangleParam(6.0, 8.2));
        map.put(5L, new TriangleParam(7.0, 9.2));
        map.put(6L, new TriangleParam(0, 0));
        map.put(7L, new TriangleParam(0, 0));
        warehouse.setTriangleList(map);
    }

    @Test
    public void testSearch() throws BasicException {
        search.setMinPerimeter(15.0);
        search.setMaxPerimeter(20.3);
        Point point4 = new Point(7.0, 4.0);
        Point point5 = new Point(3.0, 1.0);
        Point point6 = new Point(5.0, 8.0);
        Triangle triangle = new Triangle(point4, point5, point6);
        assertTrue(search.search(triangle));
    }
}