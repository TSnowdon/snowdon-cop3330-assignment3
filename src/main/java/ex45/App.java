/*
 * UCF COP3330 Fall 2021 Assignment 3 Solution
 * Copyright 2021 Tyler Snowdon
 */

package ex45;

import tools.Utils;
import tools.WordFinder;

public class App {

    private static final String INPUT_FILE = "src/main/resources/input/exercise45_input.txt";
    private static final String OUTPUT_FILE = "src/main/resources/output/exercise45_output.txt"; // For testing purposes

    public static void main(String[] args) {
        // Construct an object that stores the file we are reading and writing too.
        WordFinder finder = new WordFinder(INPUT_FILE, "src/main/resources/output/" + Utils.queryString("What is the name of the output file?") + ".txt");
        // Iterate over the contents of the file and replace "utilize" with "use"
        finder.findAndReplace("utilize", "use");
        // Output file
        finder.output();
    }
}
