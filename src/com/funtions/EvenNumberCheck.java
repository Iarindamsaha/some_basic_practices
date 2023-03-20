package com.funtions;

public class EvenNumberCheck {

    public static boolean isEven(int number){

        if(number%2==0){
            return true;
        }
        else {
            return false;
        }
    }

    public static void evenCheck(int number){

        if(isEven(number)){
            System.out.println("The Number is a Even Number");
        }
        else {
            System.out.println("The Number is Not an Even Number");
        }
    }

    public static void main(String[] args) {
        evenCheck(3);
    }
}
