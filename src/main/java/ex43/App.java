/*
 * UCF COP3330 Fall 2021 Assignment 3 Solution
 * Copyright 2021 Tyler Snowdon
 */

package ex43;

import tools.Utils;

import java.io.IOException;

public class App {

    private static WebsiteTemplate template;

    public static void main(String[] args) {
        // Ask for template design
        askInput();
        // Generate template
        template.build();
    }

    public static void askInput() {
        String name = Utils.queryString("Site name:");
        String author = Utils.queryString("Author:");
        String hasJS = Utils.queryString("Do you want a folder for JavaScript?");
        String hasCS = Utils.queryString("Do you want a folder for CSS?");

        template = new WebsiteTemplate(name, author, hasJS.equals("y"), hasCS.equals("y"));
    }
}
