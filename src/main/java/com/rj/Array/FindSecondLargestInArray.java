package com.rj.Array;

public class FindSecondLargestInArray {
    public static void main(String[] args) {
        int[] a = {14, 6, 8, 10, 1, 5, 9};
        findSecondLargest(a);
    }

    public static void findSecondLargest(int[] a) {
        int max = a[0];
        int secondMax = a[1];
        for (int i = 2; i <= a.length - 1; i++) {

            if (a[i] > max) {
                max = a[i];
            }
            if (a[i]> secondMax && a[i]<max){
                secondMax =a[i];
            }
        }
        System.out.println("First Largest : " + max + " Second largest : " + secondMax);
    }

}
