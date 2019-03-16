package com.epam.first.parser;

import com.epam.first.exception.BasicException;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ParserStringTest {

    private ParserString parserString = new ParserString();

    @Test
    public void testParseString() throws BasicException {
        double[] expected = new double[]{1.0, 4.0, 3.0, 6.0, 2.0, 9.0};
        double[] actual = parserString.parseString("1.0 4.0 3.0 6.0 2.0 9.0");
        assertEquals(expected, actual);
    }

}