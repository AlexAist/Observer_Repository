package com.epam.first.reader;

import com.epam.first.exception.BasicException;
import com.epam.first.validator.Validator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class DataReader {

    private static final Logger LOG = LogManager.getLogger();
    public static final String FILE_PATH = "infoFiles//info.txt";

    public List<String> readFile(String path) {
        List<String> lines = new ArrayList<>();
        Stream<String> stream = null;
        try {
            if (!Validator.checkFile(path)) {
                throw new BasicException("File doesn't exist!");
            }
            stream = Files.lines(Paths.get(path));
            stream.forEach(string -> {
                if (Validator.checkWithRegExp(string)) {
                    lines.add(string);
                }
            });
        } catch (IOException | BasicException e) {
            LOG.error("read error", e);
            throw new RuntimeException();
        } finally {
            if (stream != null) {
                stream.close();
            }
        }
        return lines;
    }
}
