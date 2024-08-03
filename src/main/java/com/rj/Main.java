package com.rj;


import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int alpha = 50;
        System.out.println(alpha + " : before function call");

        System.out.println(alpha + " : after function call");
        List<String> names = new ArrayList<>();
        names.add("Alex");
        names.add("Bob");
        System.out.println(alpha + " : before");
        System.out.println(names + " : before");
        callByValueAndReference(alpha, names);
        System.out.println(alpha + " : after");
        System.out.println(names + " : after");

        callByReference(names);
        System.out.println(names + " : after");
    }

    public static void callByValueAndReference(int y, List<String> namesList) {
        System.out.println(y + " : received in function");
        y = y + 100;
        System.out.println(y + " : change in function");
        namesList.add("Raju");
        namesList.add("Rahul");

    }

    public static void callByReference(List<String> kites){
        System.out.println("List received : "+ kites);
        kites = new ArrayList<>();
        kites.add("Red");
        kites.add("blue");
        System.out.println(kites + " : after change in function");
    }
}