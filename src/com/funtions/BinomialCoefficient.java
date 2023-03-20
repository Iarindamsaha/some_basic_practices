package com.funtions;

public class BinomialCoefficient {

    public static int factorialCalculator(int n){

        int facto = 1;

        for(int i = 1 ; i <= n ; i++){

            facto = facto * i;

        }
        return facto;
    }


    public static int binomialCoefficientCalculator(int n , int r){

        int factoN = factorialCalculator(n);
        int factoR = factorialCalculator(r);
        int factoNR= factorialCalculator(n-r);
        int abc = factoN/(factoR*factoNR);
        return abc;

    }

    public static void main(String[] args) {

        int a = 5;
        int b = 2;

        System.out.println(binomialCoefficientCalculator(a,b));

    }
}
