package com.rj.Strings;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharinString {
    public static void main(String[] args) {
        String text = "Ram Ram jai Raja Ram";
        duplicateChar(text);
    }

    public static void duplicateChar(String text) {
        HashMap<Character, Integer> charHashMap = new HashMap<>();
        char[] charStringArray = text.toCharArray();
        for (char ch : charStringArray) {
            if (charHashMap.containsKey(ch)) {
                charHashMap.put(ch, charHashMap.get(ch) + 1);
            } else {
                charHashMap.put(ch, 1);
            }
        }

        for (Map.Entry<Character, Integer> chMap : charHashMap.entrySet()) {
            if (chMap.getValue() > 1) {
                System.out.println(chMap.getKey() + " Occurs :" + chMap.getValue());
            }
        }

    }
}
