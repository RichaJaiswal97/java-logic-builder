package com.rj;

public class ReverseANumber {
    public static void main(String[] args) {

        int num = 258;
        System.out.println("Reverse num : " +reverseNumber(num));
    }

    public static int reverseNumber(int num) {
        int reverseNum = 0;
        for (int i = 0; i <= num; i++) {
            reverseNum = (reverseNum * 10) + (num % 10);
            num = num/10;
        }

        return reverseNum;
    }
}
