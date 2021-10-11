
/*
 * UCF COP3330 Fall 2021 Assignment 3 Solution
 * Copyright 2021 Tyler Snowdon
 */

package ex41;

import tools.Utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class App {
    private static final String INPUT_FILE = "src/main/resources/input/exercise41_input.txt";
    private static final String OUTPUT_FILE = "src/main/resources/output/exercise41_output.txt";

    private static ArrayList<String> people = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        // Read Input
        readFile();
        // Sort Data
        sortPeople();
        // Output Sorted Data
        writeFile();
    }

    public static void readFile() throws FileNotFoundException {
        File input = new File(INPUT_FILE);
        Scanner reader = new Scanner(input);
        while (reader.hasNext()) {
            String line = reader.nextLine();
            people.add(line);
        }
        reader.close();
    }

    public static void sortPeople() {
        people = (ArrayList<String>) people.stream().sorted(String::compareTo).collect(Collectors.toList());
    }

    public static void writeFile() throws IOException {
        File output = new File(OUTPUT_FILE);
        FileWriter writer = new FileWriter(output);
        writer.write(Utils.writeFormatted("Total of %d names", people.size()));
        writer.write(Utils.writeRepeated("-", 17));
        for (int i = 0; i < people.size(); i++) {
            writer.write(people.get(i));
            if (i != people.size() - 1) writer.write("\n");
        }
        writer.close();
    }
}