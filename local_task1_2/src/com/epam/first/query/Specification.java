package com.epam.first.query;

import com.epam.first.entity.AbstractEntity;
import com.epam.first.exception.BasicException;

public interface Specification {

    boolean search(AbstractEntity entity) throws BasicException;
}
