package com.practiceRandom;

public class PrintCommaAnd {

    public static void printComma(String arr[]){

            String comma = "";


            for(int i = 0; i< arr.length; i++){
                System.out.print(comma+arr[i]);
                comma = " , ";

                if(i == arr.length-2){

                    comma="";
                    System.out.print(" and ");

                }
            }
            System.out.print(" . ");

        }

    public static void main(String[] args) {
        String arr[] = {"Apple", "banana", "blueberry", "pear","grapes"};
        printComma(arr);

    }
}
