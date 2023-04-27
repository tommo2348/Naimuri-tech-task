package com.example.fileparser;

import com.example.model.Dictionary;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FileParserTest {
    private static final String FILE_PATH = "src/test/resources/test-file.txt";
    private FileParser testSubject;

    @BeforeEach
    void setup() {
        testSubject = new FileParser();
    }

    @Test
    void fileParser_shouldParseTextFileIntoDictionary() {
        Dictionary actual = testSubject.parseFile(FILE_PATH);

        assertThat(actual).isEqualTo(new Dictionary(Set.of("hello", "hi", "goodbye", "bye")));
    }
}
