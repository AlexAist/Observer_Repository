package com.epam.first.query;

import com.epam.first.entity.AbstractEntity;
import com.epam.first.exception.BasicException;
import com.epam.first.warehouse.CalcParam;
import com.epam.first.warehouse.TriangleParam;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class SearchPerimeter implements Specification {

    private double minPerimeter;
    private double maxPerimeter;
    private static final Logger LOG = LogManager.getLogger();

    public SearchPerimeter() {
    }

    public SearchPerimeter(double minPerimeter, double maxPerimeter) {
        this.minPerimeter = minPerimeter;
        this.maxPerimeter = maxPerimeter;
    }

    public double getMinPerimeter() {
        return minPerimeter;
    }

    public void setMinPerimeter(double minPerimeter) {
        if(minPerimeter > 0){
            this.minPerimeter = minPerimeter;
        }else{
            LOG.log(Level.ERROR, "Invalid perimeter");
        }
    }

    public double getMaxPerimeter() {
        return maxPerimeter;
    }

    public void setMaxPerimeter(double maxPerimeter) {
        if(maxPerimeter > 0){
            this.maxPerimeter = maxPerimeter;
        }else{
            LOG.log(Level.ERROR, "Invalid perimeter");
        }
    }

    @Override
    public boolean search(AbstractEntity entity) throws BasicException {
        if(entity == null){
            throw new BasicException("Object is null!");
        }
        CalcParam calcParam = new CalcParam();
        TriangleParam triangleParam = calcParam.entityParam(entity);
        double perimeter = triangleParam.getPerimeter();
        return (perimeter > minPerimeter && perimeter < maxPerimeter);
    }
}
