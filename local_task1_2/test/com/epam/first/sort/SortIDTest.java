package com.epam.first.sort;

import com.epam.first.entity.Triangle;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SortIDTest {

    private SortID sortID = new SortID();

    @Test
    public void testCompare() {
        Triangle triangle1 = new Triangle();
        Triangle triangle2 = new Triangle();
        assertEquals(-1, sortID.compare(triangle1, triangle2));
    }
}