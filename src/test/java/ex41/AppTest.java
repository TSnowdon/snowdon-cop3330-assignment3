/*
 * UCF COP3330 Fall 2021 Assignment 3 Solution
 * Copyright 2021 Tyler Snowdon
 */

package ex41;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    @Test
    public void test() throws IOException {
        App.readFile();
        App.sortPeople();
        App.writeFile();
        assertTrue(() -> new File("src/main/resources/output/exercise41_output.txt").exists());
    }
}
