package com.rj.Array;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {5, 8, 3, 2, 1, 9};
        System.out.println(Arrays.toString(reverseArray(array)));
        System.out.println("reverse array without using temp array : " + reversArrayWithoutTmpArray(array));
    }

    public static int[] reverseArray(int[] a) {
        int[] reverse = new int[a.length];
        int i = a.length - 1;
        int j = 0;
        while (i >= 0) {
            reverse[j] = a[i];
            i--;
            j++;
        }
        return reverse;
    }

    public static String reversArrayWithoutTmpArray(int[] a) {
        int temp = 0;
        for(int i=a.length-1, j=0; i>=j; i--,j++){
            temp = a[j];
            a[j] =a[i];
            a[i] =temp;

        }
        return Arrays.toString(a);
    }
}
