package com.rj.Array;

public class FindSmallestInArray {
    public static void main(String[] args) {
        int[] array = {3,6,1,6,9,10,-1,2};
        smallest(array);
    }

    public static void smallest(int[] a){
        int small = a[0];
        for (int i=0; i<=a.length-1; i++){
            if(a[i]<small){
                small = a[i];
            }
        }
        System.out.println("Smallest num : " + small);
    }
}
