package com.epam.first.warehouse;

import com.epam.first.entity.Point;
import com.epam.first.entity.Triangle;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class WarehouseTest {

    private Warehouse warehouse = Warehouse.getWarehouse();
    private Triangle triangle1 = new Triangle(new Point(1, 3), new Point(3, 5), new Point(5, 3));

    @BeforeClass
    public void init() {
        Triangle triangle2 = new Triangle(new Point(6.2, 3.1), new Point(8.2, 6.2), new Point(5.2, 8));
        warehouse.add(triangle1);
        warehouse.add(triangle2);
    }

    @Test
    public void testAdd() {
        Triangle triangle = new Triangle(new Point(4, 3), new Point(6, 5), new Point(5, 8));
        assertNull(warehouse.add(triangle));
    }

    @Test
    public void testRemove() {
        TriangleParam triangleParam = new TriangleParam(3.9999999999999982, 9.65685424949238);
        assertEquals(triangleParam, warehouse.remove(triangle1));
    }
}