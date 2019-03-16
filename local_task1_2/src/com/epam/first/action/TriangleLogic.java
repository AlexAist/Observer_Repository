package com.epam.first.action;

public class TriangleLogic {

    public boolean isTriangle(double x1, double x2, double x3, double y1, double y2, double y3) {
        //y = kx + b
        double k = (y1 - y2) / (x1 - x2);
        //b = y1 - kx1
        double b = y1 - k * x1;
        return k * x3 + b == y3;
    }

    public double triangleSide(double x1, double x2, double y1, double y2) {
        double dx = x1 - x2;
        double dy = y1 - y2;
        return Math.hypot(dx, dy);
    }

    public double trianglePerimeter(double a, double b, double c) {
        return a + b + c;
    }

    public double triangleSquare(double perimeter, double a, double b, double c) {
        double semiperimeter = perimeter / 2;
        return Math.sqrt(semiperimeter * (semiperimeter - a) * (semiperimeter - b) * (semiperimeter - c));
    }

    public boolean isObtuseTriangle(double a, double b, double c) {
        return a * a > b * b + c * c ||
                b * b > a * a + c * c ||
                c * c > b * b + a * a;
    }

    public boolean isRectangularTriangle(double a, double b, double c) {
        return a * a == b * b + c * c ||
                b * b == a * a + c * c ||
                c * c == b * b + a * a;
    }

    public boolean isAcuteangleTriangle(double a, double b, double c) {
        return a * a < b * b + c * c &&
                b * b < a * a + c * c &&
                c * c < b * b + a * a;
    }

    public boolean isIsoscelesTriangle(double a, double b, double c) {
        boolean first = a == b && a != c;
        boolean sec = a == c && a != b;
        boolean third = b == a && b != c;
        return first || sec || third;
    }

    public boolean isEquilateralTriangle(double a, double b, double c) {
        return a == b && b == c;
    }

    public boolean isVersatileTriangle(double a, double b, double c) {
        return a != b && b != c && a != c;
    }

}
