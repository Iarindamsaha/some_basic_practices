package com.conditional;

import java.util.Scanner;

public class CheckPositiveNegative {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter One Number To Verify :: ");
        int input = sc.nextInt();

        if( input < 0 ){
            System.out.println(input + "  is Negative ");
        }
        else {
            System.out.println(input + "  is Positive ");
        }

    }
}
