package com.funtions;

public class Factorial {

    public static int factorialCalculator(int n){

        int facto = 1;
        for(int i = 1 ; i <= n ; i++){

            facto = facto * i;

        }
        return facto;
    }

    public static void main(String[] args) {
        int a = 7;
        System.out.println(factorialCalculator(a));
    }
}
