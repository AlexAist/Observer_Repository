package com.epam.first.action;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TriangleLogicTest {

    private double delta = 0.01;
    private TriangleLogic triangleLogic = new TriangleLogic();

    @Test
    public void testIsTriangle() {
        boolean actual = triangleLogic.isTriangle(1.0, 2.0, 3.0, 4.0, 5.0, 6.0);
        assertTrue(actual);
    }

    @Test
    public void testIsNotTriangle() {
        boolean actual = triangleLogic.isTriangle(1.1, 1.1, 1.1, 1.1, 1.1, 1.1);
        assertFalse(actual);
    }

    @Test
    public void testTriangleSide() {
        double expected = 1.41;
        double actual = triangleLogic.triangleSide(1.0, 2.0, 3.0, 4.0);
        assertEquals(expected, actual, delta);
    }

    @Test
    public void testTriangleSide1() {
        double expected = 4.19;
        double actual = triangleLogic.triangleSide(9.4, 5.3, 4.2, 3.3);
        assertEquals(expected, actual, delta);
    }

    @Test
    public void testTrianglePerimeter() {
        double expected = 12.0;
        double actual = triangleLogic.trianglePerimeter(3.0, 4.0, 5.0);
        assertEquals(expected, actual, delta);
    }

    @Test
    public void testTrianglePerimeter1() {
        double expected = 15.7;
        double actual = triangleLogic.trianglePerimeter(7.3, 3.2, 5.2);
        assertEquals(expected, actual, delta);
    }

    @Test
    public void testTriangleSquare() {
        double expected = 6.0;
        double actual = triangleLogic.triangleSquare(12.0, 3.0, 4.0, 5.0);
        assertEquals(expected, actual, delta);
    }

    @Test
    public void testTriangleSquare1() {
        double expected = 4.47;
        double actual = triangleLogic.triangleSquare(11.6, 2.2, 5.2, 4.2);
        assertEquals(expected, actual, delta);
    }

    @Test
    public void testIsObtuseTriangle() {
        boolean actual = triangleLogic.isObtuseTriangle(2.0, 2.0, 5.0);
        assertTrue(actual);
    }

    @Test
    public void testIsNotObtuseTriangle() {
        boolean actual = triangleLogic.isObtuseTriangle(3.0, 4.0, 5.0);
        assertFalse(actual);
    }

    @Test
    public void testIsRectangularTriangle() {
        boolean actual = triangleLogic.isRectangularTriangle(3.0, 4.0, 5.0);
        assertTrue(actual);
    }

    @Test
    public void testIsNotRectangularTriangle() {
        boolean actual = triangleLogic.isRectangularTriangle(4.0, 4.0, 4.0);
        assertFalse(actual);
    }

    @Test
    public void testIsAcuteangleTriangle() {
        boolean actual = triangleLogic.isAcuteangleTriangle(6.0, 6.0, 4.0);
        assertTrue(actual);
    }

    @Test
    public void testIsNotAcuteangleTriangle() {
        boolean actual = triangleLogic.isAcuteangleTriangle(12.0, 8.0, 7.0);
        assertFalse(actual);
    }

    @Test
    public void testIsIsoscelesTriangle() {
        boolean actual = triangleLogic.isIsoscelesTriangle(2.0, 3.0, 2.0);
        assertTrue(actual);
    }

    @Test
    public void testIsNotIsoscelesTriangle() {
        boolean actual = triangleLogic.isIsoscelesTriangle(5.0, 5.0, 5.0);
        assertFalse(actual);
    }

    @Test
    public void testIsEquilateralTriangle() {
        boolean actual = triangleLogic.isEquilateralTriangle(2.0, 2.0, 2.0);
        assertTrue(actual);
    }

    @Test
    public void testIsEquilateralTriangle1() {
        boolean actual = triangleLogic.isEquilateralTriangle(1.0, 4.0, 5.0);
        assertFalse(actual);
    }

    @Test
    public void testIsVersatileTriangle() {
        boolean actual = triangleLogic.isVersatileTriangle(2.0, 3.0, 5.0);
        assertTrue(actual);
    }

    @Test
    public void testIsVersatileTriangle1() {
        boolean actual = triangleLogic.isVersatileTriangle(7.0, 7.0, 7.0);
        assertFalse(actual);
    }
}