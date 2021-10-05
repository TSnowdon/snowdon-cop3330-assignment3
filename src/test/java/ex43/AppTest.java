/*
 * UCF COP3330 Fall 2021 Assignment 3 Solution
 * Copyright 2021 Tyler Snowdon
 */

package ex43;

import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    public void test() {
        assertTrue(() -> {
            WebsiteTemplate testTemplate = new WebsiteTemplate("awesomeco", "Max Power", true, true);
            testTemplate.build();
            return new File("src/main/java/ex43/website/awesomeco/index.html").exists();
        });
    }
}
