package com.rj.Strings;

public class NumberofWords {

    public static void main(String[] args) {
        String text = "alex bob dela rahul";
        System.out.println("Word count : " + numberOfwords(text));
    }

    public static int numberOfwords(String text) {
        if (text.isEmpty()) {
            return 0;
        } else {
            String[] words = text.split(" ");
            return words.length;
        }
    }
}
