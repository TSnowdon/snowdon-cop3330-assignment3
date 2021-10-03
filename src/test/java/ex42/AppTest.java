/*
 * UCF COP3330 Fall 2021 Assignment 3 Solution
 * Copyright 2021 Tyler Snowdon
 */

package ex42;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    public void test() throws FileNotFoundException {
        App.readFile(App.INPUT_FILE);
        assertTrue(App.records.size() >= 7);
    }
}
