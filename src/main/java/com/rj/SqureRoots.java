package com.rj;

public class SqureRoots {
    public static void main(String[] args) {
        int num = 4;
        System.out.println("Has perfect square root : " +sqrt(num));
    }

    public static boolean sqrt(int num){

        double sqrt = Math.sqrt(num);
        double temp = sqrt - (int) sqrt;
        if(temp!=0){
            System.out.println("Square root : "+ sqrt);
            return false;
        }
        return true;
    }
}
