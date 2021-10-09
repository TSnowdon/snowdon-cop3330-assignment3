/*
 * UCF COP3330 Fall 2021 Assignment 3 Solution
 * Copyright 2021 Tyler Snowdon
 */

package ex46;

import tools.Utils;
import tools.WordFinder;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App {

    private static final String INPUT_FILE = "src/main/resources/input/exercise46_input.txt";

    private static WordFinder finder = null;
    private static List<Frequency> wordFrequencies = new ArrayList<>();

    public static void main(String[] args) {
        // Create a Word Finder for the file
        finder = new WordFinder(INPUT_FILE, null);
        // Create a HashMap that will store the frequency of the key in INPUT_FILE as its value.
        countFrequencies("snake", "badger", "mushroom");
        // Print Results
        printFrequencies();
    }

    public static void countFrequencies(String... words) {
        long value = 0;
        for (String word : words) {
            value = finder.count(word);
            wordFrequencies.add(new Frequency(word, value));
        }
        // Sort
        wordFrequencies = wordFrequencies.stream().sorted().collect(Collectors.toList());
    }

    public static void printFrequencies() {
        for (Frequency freq : wordFrequencies) {
            Utils.output("%-10s %-10s", freq.getWord() + ":", Utils.writeRepeated("*", Math.toIntExact(freq.getAmount()), false));
        }
    }
}
