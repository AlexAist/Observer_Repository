package com.epam.first.validator;

import com.epam.first.reader.DataReader;
import com.epam.first.warehouse.TriangleParam;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static org.testng.Assert.*;

public class ValidatorTest {

    @Test
    public void testCheckWithRegExp() {
        String testStr = "1.3 1.2 4.3 1.3 1.2 4.3";
        boolean exp = Validator.checkWithRegExp(testStr);
        assertTrue(exp, "error in testCheckWithRegExp");
    }

    @Test
    public void testCheckWithRegExpSec() {
        String testStr = "1.3 1.2z 4.3z 1.3 1.2z 4.3z";
        boolean exp = Validator.checkWithRegExp(testStr);
        assertFalse(exp, "error in testCheckWithRegExpSec");
    }

    @Test
    public void testCheckFile() {
        String fileName = "info.txt";
        boolean exp = Validator.checkFile(fileName);
        assertFalse(exp, "error in testCheckFile");
    }

    @Test
    public void testCheckFileSec() {
        boolean exp = Validator.checkFile(DataReader.FILE_PATH);
        assertTrue(exp, "error in testCheckFile");
    }

    @Test
    public void testCheckList() {
        Map<Long, TriangleParam> triangleList = new HashMap<>();
        assertTrue(Validator.checkList(triangleList), "error int checkList");
    }
}