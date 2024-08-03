package com.rj.Array;

public class FindLargestNumberInArray {
    public static void main(String[] args) {
        int[] a = {4, 6, 8, 0, 1, 5, 9};
        findLargest(a);
    }

    public static void findLargest(int[] a) {
        int max = a[0];
        for (int i = 1; i <= a.length - 1; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("Max : " + max);
    }
}
