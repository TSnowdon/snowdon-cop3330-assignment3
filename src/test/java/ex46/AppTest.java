/*
 * UCF COP3330 Fall 2021 Assignment 3 Solution
 * Copyright 2021 Tyler Snowdon
 */

package ex46;

import org.junit.jupiter.api.Test;
import tools.WordFinder;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    public void test() {
        WordFinder finder = new WordFinder("src/main/resources/input/exercise46_input.txt", null);
        assertEquals(1, finder.count("snake")); // # of snake
        assertEquals(7, finder.count("badger")); // # of badger
        assertEquals(2, finder.count("mushroom")); // # of mushroom
    }
}
