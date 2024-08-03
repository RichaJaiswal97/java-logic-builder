package com.rj.Array;

public class FindSecondSmallest {
    public static void main(String[] args) {
        int[] array = {-3, 6, 1, 6, 9, 10, 1, 2};
        smallest(array);

    }

    public static void smallest(int[] a) {
        int smallest = a[0];
        int secondSmallest = a[1];
        for (int i = 2; i <= a.length - 1; i++) {

            if(smallest>secondSmallest){
                smallest = secondSmallest;
            }
            if (a[i] < smallest) {
                secondSmallest =smallest;
                smallest = a[i];
            }
            if (a[i]>smallest && secondSmallest>a[i]){
                secondSmallest = a[i];
            }
        }
        System.out.println("Second Smallest : "+secondSmallest + " Fist Smallest : " +smallest);
    }


}
