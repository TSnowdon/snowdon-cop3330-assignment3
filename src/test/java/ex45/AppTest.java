/*
 * UCF COP3330 Fall 2021 Assignment 3 Solution
 * Copyright 2021 Tyler Snowdon
 */

package ex45;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    public void test() {
        WordFinder finder = new WordFinder("src/main/resources/input/exercise45_input.txt", "src/main/resources/output/exercise45_output.txt");
        assertEquals(2, finder.count("utilize")); // # of occurrences before replace
        finder.findAndReplace("utilize", "use");
        assertEquals(0, finder.count("utilize")); // # of occurrences after replace
        finder.output();
    }
}
