package com.conditional;

import java.util.Scanner;

public class CheckFever {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Temperature in Fahrenheit : ");
        double input = sc.nextDouble();

        if( input > 100 ){

            System.out.println(" You Have a Fever ");

        }
        else {
            System.out.println(" You Don't have a fever ");
        }
    }
}
