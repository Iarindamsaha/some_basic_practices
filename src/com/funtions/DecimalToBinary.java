package com.funtions;

public class DecimalToBinary {

    public static void decimalToBinary(int dec){

        int deca = dec;
        int pow = 0;
        int binary = 0;

        while(dec != 0){

            int rem = dec % 2;

            binary = binary + (rem * (int) Math.pow(10,pow));
            pow++;
            dec = dec / 2;

        }

        System.out.println("Decimal : "+deca+"\n"+"Binary : "+binary);
    }

    public static void main(String[] args) {

        decimalToBinary(20);

    }



}
