package com.funtions;

public class BinaryToDecimal {

    public static void binaryToDecimal(int binaryNum){

        int num = binaryNum;
        int pow = 0;
        int decimal = 0;

        while(binaryNum!=0){
            int lastDigit = binaryNum%10;
            decimal = decimal+(lastDigit*(int) Math.pow(2,pow));
            pow++;
            binaryNum =binaryNum/10;
        }

        System.out.println("Binary Num = "+num+" = "+decimal+" Decimal ");

    }

    public static void main(String[] args) {

        binaryToDecimal(101);

    }
}
