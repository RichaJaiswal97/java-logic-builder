package com.rj;


import java.util.ArrayList;
import java.util.List;

public class FindCommonElementInArray {
    public static void main(String[] args) {
        int[] a = {5, 4, -9, 2};
        int[] b = {4, 9, 5, 2};
        System.out.println("Common Element : " + findCommonElement(a, b));
    }

    public static List<Integer> findCommonElement(int[] a, int[] b) {
        List<Integer> commonElements = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    commonElements.add(a[i]);
                }
            }

        }
        return commonElements;
    }
}
