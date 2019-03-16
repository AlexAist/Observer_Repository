package com.epam.first.warehouse;

import com.epam.first.entity.AbstractEntity;

import java.util.HashMap;
import java.util.Map;

public class Warehouse  {

    private Map<Long, TriangleParam> triangleList;
    private CalcParam calcParam;
    private static Warehouse warehouse;

    private Warehouse() {
        this.triangleList = new HashMap<>();
        this.calcParam = new CalcParam();
    }

    public static Warehouse getWarehouse() {
        if (warehouse == null) {
            warehouse = new Warehouse();
        }
        return warehouse;
    }

    public Map<Long, TriangleParam> getTriangleList() {
        return triangleList;
    }

    public void setTriangleList(Map<Long, TriangleParam> triangleList) {
        this.triangleList = triangleList;
    }

    public TriangleParam add(AbstractEntity entity){
        TriangleParam param = calcParam.entityParam(entity);
        return triangleList.put(entity.getEntityId(), param);
    }

    public TriangleParam remove(AbstractEntity entity){
        return triangleList.remove(entity.getEntityId());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Warehouse warehouse = (Warehouse) o;

        if (!triangleList.equals(warehouse.triangleList)) return false;
        return calcParam.equals(warehouse.calcParam);
    }

    @Override
    public int hashCode() {
        int result = triangleList.hashCode();
        result = 31 * result + calcParam.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "triangleList=" + triangleList +
                ", calcParam=" + calcParam +
                '}';
    }
}
