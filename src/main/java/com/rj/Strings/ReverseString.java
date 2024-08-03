package com.rj.Strings;

public class ReverseString {

    public static void main(String[] args) {
        String text = "Raju";
        System.out.println(reverseString(text));
        System.out.println(reverseTheString(text));

    }

    public static String reverseString(String text) {
        StringBuilder reverse = new StringBuilder();
        for (int i = text.length() - 1; i >=0 ; i--) {
            reverse.append(text.charAt(i));
        }

        return reverse.toString();
    }

    public static String reverseTheString(String text) {
        String reverse = "";
        for (int i = text.length() - 1; i >=0 ; i--) {
            reverse = reverse + text.charAt(i);
        }

        return reverse;
    }
}
