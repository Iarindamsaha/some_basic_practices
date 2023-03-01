package com.conditional;

import java.util.Scanner;

public class CheckLeapYear {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Year : ");
        int input = sc.nextInt();

        if(input % 4 == 0){
            if(input % 100 == 0){

                if(input % 400 == 0){

                    System.out.println(input + " : is a leap year");
                }

                else {
                    System.out.println(input + " : is not a leap year");
                }
            }

            else {
                System.out.println(input + " : is a leap year ");
            }
        }

        else {
            System.out.println(input + " : is not a Leap Year");
        }

    }
}
