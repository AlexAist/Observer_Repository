package com.epam.first.query;

import com.epam.first.entity.AbstractEntity;
import com.epam.first.entity.Point;
import com.epam.first.entity.Triangle;
import com.epam.first.exception.BasicException;

public class SearchQuadrant implements Specification {

    @Override
    public boolean search(AbstractEntity entity) throws BasicException {
        if(entity == null){
            throw new BasicException("Object is null!");
        }
        Triangle triangle = (Triangle) entity;
        Point point1 = triangle.getPoint1();
        Point point2 = triangle.getPoint2();
        Point point3 = triangle.getPoint3();
        boolean xy1 = point1.getX() > 0 && point1.getY() > 0;
        boolean xy2 = point2.getX() > 0 && point2.getY() > 0;
        boolean xy3 = point3.getX() > 0 && point3.getY() > 0;
        return xy1 && xy2 && xy3;
    }

}
