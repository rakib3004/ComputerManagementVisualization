package com.company;

public class IntToDoubleExample {
    public static void main(String args[]) {
        int i = 100;
        Double d = new Double(i);// first way.
        Double d2 = Double.valueOf(i);// second way.
        System.out.println(d);
        System.out.println(d2);
    }
}