package com.rj.Strings;

import java.util.HashMap;
import java.util.Map;

public class CharOccurrenceString {
    public static void main(String[] args) {
        String text = "Radhe Radhe !!";
        charOccurance(text);
    }

    public static void charOccurance(String text){
        char[] stringChr = text.toCharArray();
        HashMap<Character, Integer> charHashMap = new HashMap<>();

        for(char ch : stringChr){
            if(charHashMap.containsKey(ch)){
                charHashMap.put(ch, charHashMap.get(ch)+1);
            }
            else {
                charHashMap.put(ch, 1);
            }
        }

        for (Map.Entry<Character, Integer>occurance : charHashMap.entrySet()){
            System.out.println(occurance.getKey() + " Occurs " + occurance.getValue());
        }
    }
}
