package com.epam.first.validator;


import com.epam.first.warehouse.TriangleParam;

import java.io.File;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {

    private static final String CORRECT_STRING = "^\\d+\\.\\d+\\s\\d+\\.\\d+\\s\\d+\\.\\d+\\s\\d+\\.\\d+\\s\\d+\\.\\d\\s\\d+\\.\\d+$";

    public static boolean checkWithRegExp(final String testString) {
        final Pattern pattern = Pattern.compile(CORRECT_STRING);
        final Matcher matcher = pattern.matcher(testString);
        return matcher.matches();
    }

    public static boolean checkFile(final String fileName) {
        final File file = new File(fileName);
        return file.exists() && file.canRead();
    }

    public static boolean checkList(final Map<Long, TriangleParam> triangleList){
        return triangleList.isEmpty();
    }
}
