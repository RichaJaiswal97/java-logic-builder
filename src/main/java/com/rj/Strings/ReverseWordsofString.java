package com.rj.Strings;

public class ReverseWordsofString {
    public static void main(String[] args) {
        String text = "My name is Raju";
        System.out.println(reverseStringofWord(text));
    }

    public static StringBuilder reverseStringofWord(String text) {
        StringBuilder reverse = new StringBuilder();
        String[] words = text.split(" ");
        for (int i = 0; i < words.length; i++) {
            String textWord = words[i];
            for (int j = textWord.length() - 1; j >= 0; j--){
                reverse.append(textWord.charAt(j));
            }
            reverse.append(" ");
        }

        return reverse;
    }
}
