package com.epam.first.factory;

import com.epam.first.entity.AbstractEntity;
import com.epam.first.entity.Point;
import com.epam.first.exception.BasicException;
import com.epam.first.parser.ParserString;

import java.util.List;

public class PointFactory implements FactoryShape {

    @Override
    public AbstractEntity createDetail() {
        return new Point();
    }

    @Override
    public AbstractEntity createDetail(double[] coordinates) {
        double x = coordinates[0];
        double y = coordinates[1];
        return new Point(x, y);
    }

    @Override
    public AbstractEntity[] createDetails(List<String> coordinateList) throws BasicException {
        Point[] points = new Point[coordinateList.size() * 3];
        ParserString parserString = new ParserString();
        for (int i = 0; i < coordinateList.size(); i++) {
            String temp = coordinateList.get(i);
            double[] tempCoordinatesArray = parserString.parseString(temp);
            for (int j = 0; j < 6; j += 2) {
                points[i * 3 + j / 2] = new Point(tempCoordinatesArray[j], tempCoordinatesArray[j + 1]);
            }
        }
        return points;
    }
}
