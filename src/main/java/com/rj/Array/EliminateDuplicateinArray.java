package com.rj.Array;

import java.util.HashSet;
import java.util.Set;

public class EliminateDuplicateinArray {
    public static void main(String[] args) {
        int[] a = {2, 6, 4, 7, 8, 0, 4, 2, 6, 7, 7};
        duplicateEliminate(a);
    }

    public static void duplicateEliminate(int[] a) {
        Set<Integer> setArray = new HashSet<>();
        for (int num : a){
            setArray.add(num);
        }

        System.out.println(setArray);

    }
}
