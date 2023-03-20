package com.easyPatterns;

import java.util.Scanner;

public class CharacterHalfPyramid {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter How Many Lines You Want To Print Stars");
        int n = sc.nextInt();
        char ch = 'A';

        for(int line = 1 ; line <= n; line++){
            for(int characters = 1; characters<=line; characters++){

                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
