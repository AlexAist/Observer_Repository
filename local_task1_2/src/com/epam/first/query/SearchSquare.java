package com.epam.first.query;

import com.epam.first.entity.AbstractEntity;
import com.epam.first.exception.BasicException;
import com.epam.first.warehouse.CalcParam;
import com.epam.first.warehouse.TriangleParam;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class SearchSquare implements Specification {

    private double minSquare;
    private double maxSquare;
    private static final Logger LOG = LogManager.getLogger();

    public SearchSquare() {
    }

    public SearchSquare(double minSquare, double maxSquare) {
        this.minSquare = minSquare;
        this.maxSquare = maxSquare;
    }

    public double getMinSquare() {
        return minSquare;
    }

    public void setMinSquare(double minSquare) {
        if(minSquare > 0) {
            this.minSquare = minSquare;
        }else {
            LOG.log(Level.ERROR, "Invalid square");
        }
    }

    public double getMaxSquare() {
        return maxSquare;
    }

    public void setMaxSquare(double maxSquare) {
        if(maxSquare > 0) {
            this.maxSquare = maxSquare;
        }else {
            LOG.log(Level.ERROR, "Invalid square");
        }
    }

    @Override
    public boolean search(AbstractEntity entity) throws BasicException {
        if(entity == null){
            throw new BasicException("Object is null!");
        }
        CalcParam calcParam = new CalcParam();
        TriangleParam triangleParam = calcParam.entityParam(entity);
        double square = triangleParam.getSquare();
        return (square > minSquare && square < maxSquare);
    }
}
