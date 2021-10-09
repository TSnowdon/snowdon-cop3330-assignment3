/*
 * UCF COP3330 Fall 2021 Assignment 3 Solution
 * Copyright 2021 Tyler Snowdon
 */

package tools;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class WordFinder {

    private String inputFile;
    private ArrayList<String> contents = new ArrayList<>();
    private String outputFile;

    public WordFinder(String inputFile, String outputFile) {
        this.inputFile = inputFile;
        this.outputFile = outputFile;


        try {
            Scanner scanner = getScanner();
            if (scanner != null) {
                while (scanner.hasNext()) {
                    contents.add(scanner.nextLine());
                }
                scanner.close();
            }
        } catch (Exception ignored) {
        }
    }

    /**
     * Reads and store all of "inputFile" into "contents"
     */
    public void findAndReplace(String find, String replace) {
        try {
            contents = new ArrayList<>();
            Scanner scanner = getScanner();
            if (scanner != null) {
                while (scanner.hasNext()) {
                    contents.add(scanner.nextLine().replace(find, replace));
                }
                scanner.close();
            }
        } catch (Exception ignored) {
        }
    }

    public long count(String find) {
        long count = 0;
        for (String content : contents) {
            String[] token = content.split(" ");
            for (String s : token) {
                if(s.contains(find)){
                    count++;
                }
            }
        }
        return count;
    }

    public void output() {
        if(outputFile == null){
            return;
        }

        try {
            File output = new File(outputFile);
            FileWriter writer = new FileWriter(output);
            for (String content : contents) {
                writer.write(content);
                writer.write("\n");
            }
            writer.close();
        } catch (Exception ignored) {

        }
    }

    private Scanner getScanner() {
        try {
            return new Scanner(new File(inputFile));
        } catch (Exception e) {
            return null;
        }
    }
}
