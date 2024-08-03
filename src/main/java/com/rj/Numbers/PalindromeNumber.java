package com.rj.Numbers;

public class PalindromeNumber {
    public static void main(String[] args) {
        int num = -1;
        System.out.println("Is given number is palindrome : " + isPalindromeNum(num));
    }

    public static boolean isPalindromeNum(int num) {
        //check num is -ve
        if (num < 0) {
            num = num * (-1);
        }
        // build reverse num
        int reveser = 0;
        int temp = num;
        while (temp > 0) {
            reveser = (reveser * 10) + temp % 10;
            temp = temp / 10;
        }
        // compare reverse with original
        if (num == reveser) {
            return true;
        }
        return false;
    }
}
