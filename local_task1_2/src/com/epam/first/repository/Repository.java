package com.epam.first.repository;

import com.epam.first.entity.AbstractEntity;
import com.epam.first.exception.BasicException;
import com.epam.first.query.Specification;

import java.util.List;

public interface Repository {

    boolean add(AbstractEntity entity);

    boolean remove(AbstractEntity entity);

    boolean update(AbstractEntity entity, int index);

    List<AbstractEntity> query(Specification queryObject) throws BasicException;
}
