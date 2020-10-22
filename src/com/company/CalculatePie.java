package com.company;

public class CalculatePie {
    public static void main(String[] args) {
        double pi=0;
        int divParameter=1;
        double pointer=4;
        int signPi=1;
        int n=1000000000;
        for(int i=0;i<n;i++){
            pi = pi+(pointer/divParameter)*signPi;
            signPi=-1*signPi;
            divParameter+=2;
        }
        System.out.println("Value of Pi : "+pi );
    }
}
