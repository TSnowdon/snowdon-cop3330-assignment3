/*
 * UCF COP3330 Fall 2021 Assignment 3 Solution
 * Copyright 2021 Tyler Snowdon
 */

package ex44;

import com.google.gson.Gson;
import tools.Utils;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class App {

    private static Inventory inventory = null;
    private static String INPUT_JSON = "src/main/resources/input/exercise44_input.json";


    public static void main(String[] args) throws IOException {
        // parse & store JSON
        parseJSON();
        // print Data
        queryProduct();
    }

    public static void parseJSON() throws IOException {
        Gson gson = new Gson();
        Reader reader = Files.newBufferedReader(Paths.get(INPUT_JSON));
        inventory = gson.fromJson(reader, Inventory.class);
        reader.close();
    }

    public static void queryProduct() {
        Product target = null;
        do {
            String productName = Utils.queryString("What is the product name?");
            target = getProduct(productName);
            if (target == null) {
                System.out.println("Sorry, that product was not found in our inventory.");
            } else {
                break;
            }
        } while (true);
        System.out.println(target);
    }

    public static Product getProduct(String name) {
        Product target = null;
        for (Product product : inventory.getProducts()) {
            if (product.getName().equals(name)) {
                target = product;
            }
        }
        return target;
    }
}
