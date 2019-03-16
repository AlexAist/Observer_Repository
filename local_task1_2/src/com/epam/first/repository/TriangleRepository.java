package com.epam.first.repository;

import com.epam.first.entity.AbstractEntity;
import com.epam.first.exception.BasicException;
import com.epam.first.query.Specification;

import java.util.ArrayList;
import java.util.List;

public class TriangleRepository implements Repository {

    private List<AbstractEntity> triangleList = new ArrayList<>();
    private static TriangleRepository repository;

    private TriangleRepository(){
    }

    public static TriangleRepository getRepository() {
        if (repository == null) {
            repository = new TriangleRepository();
        }
        return repository;
    }

    public List<AbstractEntity> getTriangleList() {
        return triangleList;
    }

    public void setTriangleList(List<AbstractEntity> triangleList) {
        this.triangleList = triangleList;
    }

    @Override
    public boolean add(AbstractEntity entity) {
        return triangleList.add(entity);
    }

    @Override
    public boolean remove(AbstractEntity entity) {
        return triangleList.remove(entity);
    }

    @Override
    public boolean update(AbstractEntity entity, int index) {
        triangleList.remove(index);
        return triangleList.add(entity);
    }

    @Override
    public List<AbstractEntity> query(Specification queryObject) throws BasicException {
        List<AbstractEntity> list = new ArrayList<>();
        for (AbstractEntity entity : triangleList) {
            if (queryObject.search(entity)) {
                list.add(entity);
            }
        }
        return list;
    }
}
