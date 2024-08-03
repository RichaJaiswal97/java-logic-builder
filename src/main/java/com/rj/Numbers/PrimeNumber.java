package com.rj.Numbers;

public class PrimeNumber {
    public static void main(String[] args) {
        int num = 113;
        System.out.println(isPrimeNumber(num));
    }
    public static boolean isPrimeNumber(int num){
        int temp = num;
        int i = 2;
        if(temp==2){
            return true;
        }
        while (num>i){
              if(temp%i==0){
                return false;
            }
            i++;
              }
        return true;
    }
}
