package com.easyPatterns;

import java.util.Scanner;

public class ReversedStarHalfPyramid {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter How Many Lines You Want To Print Stars");
        int n = sc.nextInt();

        for(int line = n; line >= 1; line--){
            for(int star =1; star<=line; star++){
                System.out.print("*");
            }

            System.out.println();

        }
    }

}
