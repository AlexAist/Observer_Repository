package com.epam.first.warehouse;

import com.epam.first.entity.Point;
import com.epam.first.entity.Triangle;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CalcParamTest {

    private CalcParam calcParam = new CalcParam();

    @DataProvider
    public Object[][] init() {
        return new Object[][]{
                {new Triangle(new Point(1, 3), new Point(3, 5), new Point(5, 3)),
                        new TriangleParam(3.9999999999999982, 9.65685424949238)}
        };
    }

    @Test(dataProvider = "init")
    public void testEntityParam(Triangle triangle, TriangleParam param) {
        assertEquals(param, calcParam.entityParam(triangle));
    }
}