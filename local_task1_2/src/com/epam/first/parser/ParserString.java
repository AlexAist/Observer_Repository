package com.epam.first.parser;

import com.epam.first.exception.BasicException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public final class ParserString {

    private static final String REGULAR_NUMBER = "\\d+\\.\\d+";
    private static final int SIZE_ARRAY = 6;
    private static final Logger LOG = LogManager.getLogger();

    public double[] parseString(final String parseString) throws BasicException {
        Pattern pattern = Pattern.compile(REGULAR_NUMBER);
        Matcher matcher = pattern.matcher(parseString);
        double[] values = new double[SIZE_ARRAY];
        int index = 0;
        while (matcher.find()) {
            if (index >= SIZE_ARRAY) {
                throw new BasicException("Index out of bound");
            }
            values[index++] = Double.parseDouble(matcher.group());
        }
        return values;
    }

}
