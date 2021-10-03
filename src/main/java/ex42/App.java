/*
 * UCF COP3330 Fall 2021 Assignment 3 Solution
 * Copyright 2021 Tyler Snowdon
 */

package ex42;

import tools.Utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static final String INPUT_FILE = "src/main/resources/input/exercise42_input.txt";

    public static ArrayList<Record> records = new ArrayList<>();

    public static void main(String[] args) throws FileNotFoundException {
        // Read the File
        readFile(INPUT_FILE);
        // Display the Data
        displayData(records);
    }

    public static void readFile(String fileName) throws FileNotFoundException {
        File inputFile = new File(fileName);
        Scanner reader = new Scanner(inputFile);
        while (reader.hasNext()) {
            String line = reader.nextLine();
            String[] data = line.split(",");
            records.add(new Record(data[1], data[0], data[2]));
        }
        reader.close();
    }

    public static void displayData(ArrayList<Record> data) {
        Utils.output("%-9s %-9s %-9s", "Last", "First", "Salary");
        Utils.printRepeated("-", 26);
        for (Record record : records) {
            Utils.output("%-9s %-9s %-9s", record.getLastName(), record.getFirstName(), record.getSalary());
        }

    }
}
