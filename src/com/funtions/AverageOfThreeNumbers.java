package com.funtions;

public class AverageOfThreeNumbers {

    public static void average(int a , int b, int c){

        int sum = a+b+c;
        int averages = sum/3;
        System.out.print("The Average of Entered Number is : "+averages);

    }

    public static void main(String[] args) {

        average(2,2,2);

    }
}
