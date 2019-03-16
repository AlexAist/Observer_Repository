package com.epam.first.reader;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;

public class DataReaderTest {

    private DataReader dataReader = new DataReader();

    @DataProvider
    private Object[][] init() {
        List<String> list = new ArrayList<>();
        list.add("1.0 4.0 3.0 6.0 2.0 9.0");
        list.add("7.0 4.0 3.0 1.0 5.0 8.0");
        return new Object[][]{
                {"infoFiles//info.txt", list}
        };
    }

    @Test(dataProvider = "init")
    public void testReadFile(String path, List<String> list) {
        assertEquals(list, dataReader.readFile(path));
    }
}