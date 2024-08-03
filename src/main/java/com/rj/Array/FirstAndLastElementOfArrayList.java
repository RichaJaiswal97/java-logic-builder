package com.rj.Array;

import java.util.ArrayList;
import java.util.List;

public class FirstAndLastElementOfArrayList {
    public static void main(String[] args) {
        List<Integer>s = new ArrayList<>();
        s.add(4);
        s.add(5);
        s.add(7);
        s.add(8);
      arrayList(s);
    }

    public static void arrayList(List<Integer> s){
        int fistElement = s.get(0);
        int lastElement = s.get(s.size()-1);
        System.out.println("Fist Element : " + fistElement + " Last Element : " + lastElement);
    }
}
