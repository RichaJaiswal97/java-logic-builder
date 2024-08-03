package com.rj;

public class SumofDigitsTillSingleDigit {
    public static void main(String[] args) {
        int num = 3456;
        System.out.println("Sum of digits : "+ sumOfDigits(num));
    }

    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum = sum + digit;

            num = num / 10;
        }
        System.out.println("Sum of digits : " + sum);
        if (sum > 9) {
            sum = sumOfDigits(sum);
        }
        return sum;
    }
}
