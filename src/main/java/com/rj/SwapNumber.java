package com.rj;

public class SwapNumber {
    public static void main(String[] args) {
        int a = 25;
        int b = 10;
        swapNumber(a, b);
    }

    public static void swapNumber(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Value of a : " +a);
        System.out.println("Valur of b : " +b);
    }
}
