package com.epam.first.sort;

import com.epam.first.entity.Point;
import com.epam.first.entity.Triangle;

import java.util.Comparator;

public class SortY implements Comparator<Triangle> {

    @Override
    public int compare(Triangle o1, Triangle o2) {
        Point point1 = o1.getPoint1();
        Point point2 = o2.getPoint1();
        return Double.compare(point1.getY(), point2.getY());
    }
}
