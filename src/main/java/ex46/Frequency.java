/*
 * UCF COP3330 Fall 2021 Assignment 3 Solution
 * Copyright 2021 Tyler Snowdon
 */

package ex46;

public class Frequency implements Comparable<Frequency> {
    private String word;
    private long amount;

    public Frequency(String word, long amount){
        this.word = word;
        this.amount = amount;
    }

    public long getAmount() {
        return amount;
    }

    public String getWord() {
        return word;
    }

    @Override
    public String toString() {
        return "Frequency{" +
                "word='" + word + '\'' +
                ", amount=" + amount +
                '}';
    }

    @Override
    public int compareTo(Frequency o) {
        return Math.toIntExact(o.getAmount() - this.getAmount());
    }
}
