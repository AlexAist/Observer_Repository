package com.epam.first.observer;

import com.epam.first.entity.AbstractEntity;
import com.epam.first.warehouse.Warehouse;

public class TriangleObserver implements Observer {

    private static TriangleObserver triangleObserver;

    private TriangleObserver() {
    }

    public static TriangleObserver getTriangleObserver() {
        if (triangleObserver == null) {
            triangleObserver = new TriangleObserver();
        }
        return triangleObserver;
    }

    @Override
    public void update(Observable obs) {
        Warehouse warehouse = Warehouse.getWarehouse();
        AbstractEntity entity = (AbstractEntity) obs;
        warehouse.remove(entity);
        warehouse.add(entity);
    }


}
