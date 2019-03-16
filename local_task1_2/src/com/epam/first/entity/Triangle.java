package com.epam.first.entity;

import com.epam.first.action.IdGenerator;
import com.epam.first.observer.Observable;
import com.epam.first.observer.Observer;
import com.epam.first.observer.TriangleObserver;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Triangle extends AbstractEntity implements Observable {

    private Point point1;
    private Point point2;
    private Point point3;
    private TriangleObserver triangleObserver;
    private static final Logger LOG = LogManager.getLogger();

    public Triangle() {
        super(IdGenerator.getId());
        this.point1 = new Point();
        this.point2 = new Point();
        this.point3 = new Point();
    }

    public Triangle(Point point1, Point point2, Point point3) {
        super(IdGenerator.getId());
        if (point1 != null && point2 != null && point3 != null) {
            this.point1 = point1;
            this.point2 = point2;
            this.point3 = point3;
        } else {
            LOG.log(Level.ERROR, "Argument point is null!");
        }
    }

    public Point getPoint1() {
        return point1;
    }

    public void setPoint1(Point point1) {
        if (point1 != null) {
            this.point1 = point1;
            this.notifyObservers();
        } else {
            LOG.log(Level.ERROR, "Argument point is null!");
        }
    }

    public Point getPoint2() {
        return point2;
    }

    public void setPoint2(Point point2) {
        if (point2 != null) {
            this.point2 = point1;
            this.notifyObservers();
        } else {
            LOG.log(Level.ERROR, "Argument point is null!");
        }
    }

    public Point getPoint3() {
        return point3;
    }

    public void setPoint3(Point point3) {
        if (point3 != null) {
            this.point3 = point1;
            this.notifyObservers();
        } else {
            LOG.log(Level.ERROR, "Argument point is null!");
        }
    }

    @Override
    public void attach(Observer observer) {
        if (observer != null) {
            this.triangleObserver = (TriangleObserver) observer;
        } else {
            LOG.log(Level.ERROR, "Argument observer is null!");
        }
    }

    @Override
    public void detach() {
        this.triangleObserver = null;
    }

    @Override
    public void notifyObservers() {
        if (this.triangleObserver != null) {
            this.triangleObserver.update(this);
        } else {
           LOG.log(Level.ERROR, "Object " + toString() + " doesn't have observer!");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Triangle triangle = (Triangle) o;

        if (!point1.equals(triangle.point1)) return false;
        if (!point2.equals(triangle.point2)) return false;
        return point3.equals(triangle.point3);
    }

    @Override
    public int hashCode() {
        int result = point1.hashCode();
        result = 31 * result + point2.hashCode();
        result = 31 * result + point3.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "point1=" + point1 +
                ", point2=" + point2 +
                ", point3=" + point3 +
                "} " + super.toString();
    }
}
