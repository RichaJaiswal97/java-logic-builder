package com.rj.Array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EliminateDuplicateFromArrayList {
    public static void main(String[] args) {
        List<Integer>arrayList = new ArrayList<>();
        arrayList.add(4);
        arrayList.add(6);
        arrayList.add(1);
        arrayList.add(8);
        arrayList.add(0);
        arrayList.add(0);
        arrayList.add(6);
        arrayList.add(4);

        eliminateDuplicate(arrayList);

    }
    public static void eliminateDuplicate(List<Integer>a){
        Set<Integer>arraySet = new HashSet<>();
        for (int num : a){
            arraySet.add(num);
        }
        System.out.println(arraySet);
    }
}
