package com.rj;

public class FactorialNumber {
    public static void main(String[] args) {
        int num = 5;
        System.out.println("Factorial of number : " + factorialOfNumber(num));
        System.out.println("Factorial of number(2) : " + factorialNumber(num));
        System.out.println("Factorial of number(3) : " + factNumb(num));
    }

    public static int factorialOfNumber(int num) {
        int fact = 0;
        int tmp = num;

        for (int i = num - 1; i < num && i > 0; i--) {
            fact = tmp * (i);
            tmp = fact;
        }

        return fact;
    }

    public static int factorialNumber(int num) {
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

    public static int factNumb(int num) {
        int fact = num;
        while (num > 1) {
            fact = fact * (num - 1);
            num--;
        }


        return fact;
    }
}
