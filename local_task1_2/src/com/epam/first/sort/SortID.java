package com.epam.first.sort;

import com.epam.first.entity.Triangle;

import java.util.Comparator;

public class SortID implements Comparator<Triangle> {

    @Override
    public int compare(Triangle o1, Triangle o2) {
        return Long.compare(o1.getEntityId(), o2.getEntityId());
    }
}
