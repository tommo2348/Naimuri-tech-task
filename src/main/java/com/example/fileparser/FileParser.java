package com.example.fileparser;

import com.example.model.Dictionary;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.List;

public class FileParser {

    public Dictionary parseFile(String filePath) {
        List<String> parsedWords;
        try {
            parsedWords = Files.readAllLines(Paths.get(filePath));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return new Dictionary(new HashSet<>(parsedWords));
    }
}
