package com.epam.first.factory;

import com.epam.first.entity.AbstractEntity;
import com.epam.first.exception.BasicException;

import java.util.List;

public interface FactoryShape {

    AbstractEntity createDetail();

    AbstractEntity createDetail(double[] coordinates);

    AbstractEntity[] createDetails(List<String> coordinateList) throws BasicException;
}
