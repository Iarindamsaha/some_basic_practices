package com.loops;

public class RemoveFromString {

    public static void main(String[] args) {

            String str = "This is a testing String";

            String[] arrOfStr = str.split("i");

            for (int i = 0; i < arrOfStr.length; i++){

                System.out.print(arrOfStr[i]);

            }


    }
}
