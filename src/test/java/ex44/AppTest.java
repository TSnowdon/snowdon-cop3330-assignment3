/*
 * UCF COP3330 Fall 2021 Assignment 3 Solution
 * Copyright 2021 Tyler Snowdon
 */

package ex44;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    @Test
    public void test() throws IOException {
        App.parseJSON();
        assertNull(App.getProduct("iPad"));
        assertNull(App.getProduct("Galaxy"));
        assertNotNull(App.getProduct("Thing"));
    }
}
