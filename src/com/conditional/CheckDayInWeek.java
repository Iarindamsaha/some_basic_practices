package com.conditional;

import java.util.Scanner;

public class CheckDayInWeek {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1 - 7 to check Day : ");
        int input = sc.nextInt();

        switch (input){

            case 1 :{
                System.out.println("Monday");
                break;
            }
            case 2 :{
                System.out.println("Tuesday");
                break;
            }
            case 3 :{
                System.out.println("Wednesday");
                break;
            }
            case 4 :{
                System.out.println("Thursday");
                break;
            }
            case 5 :{
                System.out.println("Friday");
                break;
            }
            case 6 :{
                System.out.println("Saturday");
                break;
            }
            case 7 :{
                System.out.println("Sunday");
                break;
            }
            default:
                System.out.println("---Enter Between 1-7---");
                break;
        }
    }
}
