package com.rj.Numbers;

public class FindOddorEven {

    public static void main(String[] args) {
        int num = 2;
        System.out.println(oddEven(num));
    }

    public static String oddEven(int num){
        String message;
        if(num ==2 || num ==0){
             message = "Number is Even";
            return message;
        }
        else if (num%2==0){
            message ="Number is Even";
            return message;
        }
        else {
            message = "Number is Odd";
            return message;
        }
    }
}

