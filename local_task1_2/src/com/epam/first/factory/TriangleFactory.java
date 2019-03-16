package com.epam.first.factory;

import com.epam.first.entity.AbstractEntity;
import com.epam.first.entity.Point;
import com.epam.first.entity.Triangle;
import com.epam.first.exception.BasicException;
import com.epam.first.parser.ParserString;

import java.util.List;

public class TriangleFactory implements FactoryShape {

    @Override
    public AbstractEntity createDetail() {
        return new Triangle();
    }

    @Override
    public AbstractEntity createDetail(double[] coordinates) {
        double x1 = coordinates[0];
        double y1 = coordinates[1];
        double x2 = coordinates[2];
        double y2 = coordinates[3];
        double x3 = coordinates[4];
        double y3 = coordinates[5];
        Point point1 = new Point(x1, y1);
        Point point2 = new Point(x2, y2);
        Point point3 = new Point(x3, y3);
        return new Triangle(point1, point2, point3);
    }

    @Override
    public AbstractEntity[] createDetails(List<String> coordinateList) throws BasicException {
        Triangle[] triangles = new Triangle[coordinateList.size()];
        ParserString parserString = new ParserString();
        for (int i = 0; i < coordinateList.size(); i++) {
            String temp = coordinateList.get(i);
            double[] tempCoordinatesArray = parserString.parseString(temp);
            Point point1 = new Point(tempCoordinatesArray[0], tempCoordinatesArray[1]);
            Point point2 = new Point(tempCoordinatesArray[2], tempCoordinatesArray[3]);
            Point point3 = new Point(tempCoordinatesArray[4], tempCoordinatesArray[5]);
            triangles[i] = new Triangle(point1, point2, point3);
        }
        return triangles;
    }
}
