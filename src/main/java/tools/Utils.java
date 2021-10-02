/*
 * UCF COP3330 Fall 2021 Assignment 3 Solution
 * Copyright 2021 Tyler Snowdon
 */

package tools;

import java.util.Scanner;

public class Utils {

    public static String queryString(String message) {
        System.out.print(message + (!message.isBlank() ? " " : ""));
        Scanner reader = new Scanner(System.in);
        return reader.nextLine();
    }

    public static int queryInt(String message) {
        System.out.print(message + (!message.isBlank() ? " " : ""));
        Scanner reader = new Scanner(System.in);
        return reader.nextInt();
    }

    public static double queryDouble(String message) {
        System.out.print(message + (!message.isBlank() ? " " : ""));
        Scanner reader = new Scanner(System.in);
        return reader.nextDouble();
    }

    public static int queryValidInt(String message) {
        int output = 0;
        do {
            try {
                output = queryInt(message);
                break;
            } catch (Exception e) {
                System.out.println("Invalid number, please try again.");
            }
        } while (true);
        return output;
    }

    public static String queryValidString(String message) {
        String output = "";
        do {
            try {
                output = queryString(message);
                break;
            } catch (Exception e) {
                System.out.println("Invalid string, please try again.");
            }
        } while (true);
        return output;
    }

    public static void output(String format, Object... args) {
        System.out.printf((format) + "\n", args);
    }

    public static void printRepeated(String input, int amount) {
        printRepeated(input, amount, true);
    }

    public static void printRepeated(String input, int amount, boolean newLine) {
        for (int i = 0; i < amount; i++) {
            System.out.print(input);
        }
        if (newLine) System.out.println();
    }

    public static String writeFormatted(String format, Object... args) {
        return String.format((format) + "\n", args);
    }

    public static String writeRepeated(String input, int amount) {
        return writeRepeated(input, amount, true);
    }

    public static String writeRepeated(String input, int amount, boolean newLine) {
        StringBuilder builder = new StringBuilder();
        builder.append(String.valueOf(input).repeat(Math.max(0, amount)));
        if (newLine) builder.append("\n");
        return builder.toString();
    }
}
