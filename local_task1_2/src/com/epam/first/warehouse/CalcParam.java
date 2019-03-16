package com.epam.first.warehouse;

import com.epam.first.action.TriangleLogic;
import com.epam.first.entity.AbstractEntity;
import com.epam.first.entity.Point;
import com.epam.first.entity.Triangle;

public class CalcParam {

    private TriangleLogic triangleLogic = new TriangleLogic();

    public TriangleParam entityParam(AbstractEntity entity){
        Triangle triangle = (Triangle)entity;
        Point point1 = triangle.getPoint1();
        Point point2 = triangle.getPoint2();
        Point point3 = triangle.getPoint3();
        double a = triangleLogic.triangleSide(point1.getX(), point2.getX(), point1.getY(), point2.getY());
        double b = triangleLogic.triangleSide(point1.getX(), point3.getX(), point1.getY(), point3.getY());
        double c = triangleLogic.triangleSide(point2.getX(), point3.getX(), point2.getY(), point3.getY());
        double perimeter = triangleLogic.trianglePerimeter(a, b , c);
        double square = triangleLogic.triangleSquare(perimeter, a, b, c);
        return new TriangleParam(square, perimeter);
    }
}
