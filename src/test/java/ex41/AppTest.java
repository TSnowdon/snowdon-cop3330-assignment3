/*
 * UCF COP3330 Fall 2021 Assignment 3 Solution
 * Copyright 2021 Tyler Snowdon
 */

package ex41;

import org.junit.jupiter.api.Test;

import java.io.IOException;

public class AppTest {
    @Test
    public void test() throws IOException {
        App.readFile();
        App.sortPeople();
        App.writeFile();
    }
}
