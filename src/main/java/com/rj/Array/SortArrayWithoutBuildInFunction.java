package com.rj.Array;

import java.util.Arrays;

public class SortArrayWithoutBuildInFunction {
    public static void main(String[] args) {
        int[] a = {8, 5, 1, 5, 7, 0};
        sortArray(a);

    }

    public static void sortArray(int[] a) {
        int temp = 0;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j <= a.length - 1; j++) {
                if (a[i] > a[j]) {
                    temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
            System.out.println("array state in pass: " + i + " " + Arrays.toString(a));
        }
        System.out.println(Arrays.toString(a));

    }
}
