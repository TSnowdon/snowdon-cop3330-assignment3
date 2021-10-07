/*
 * UCF COP3330 Fall 2021 Assignment 3 Solution
 * Copyright 2021 Tyler Snowdon
 */

package ex44;

import java.util.Arrays;

public class Inventory {
    private Product[] products;

    public Inventory(Product[] products) {
        this.products = products;
    }

    public Product[] getProducts(){
        return products;
    }

    @Override
    public String toString() {
        return "Inventory{" +
                "products=" + Arrays.toString(products) +
                '}';
    }
}
