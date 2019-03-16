package com.epam.first.query;

import com.epam.first.entity.AbstractEntity;
import com.epam.first.exception.BasicException;
import com.epam.first.repository.TriangleRepository;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.*;

public class SearchQuadrantTest {

    private SearchQuadrant quadrant = new SearchQuadrant();

    @Test
    public void testSearch() throws BasicException {
        TriangleRepository repository = TriangleRepository.getRepository();
        List<AbstractEntity> list = repository.getTriangleList();
        assertTrue(quadrant.search(list.get(3)));
    }
}