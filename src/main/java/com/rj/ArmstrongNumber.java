package com.rj;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int num = 123;
        System.out.println("Is the given number is a armstrong number : " + armstrongNumber(num));
    }

    public static boolean armstrongNumber(int num) {
        int temp = num;
        double amst = 0;
        int power = 0;
        while (num > 0) {
            power++;
            num = num / 10;
        }

        num = temp;
        while (num>0){
            int digit = num % 10;
            amst = amst + Math.pow(digit, power);
            num = num / 10;
        }
        System.out.println("Given Num : " + temp);
        System.out.println("Armst Num : " + amst);
        if (temp == amst) {
            return true;
        }
        return false;
    }
}
