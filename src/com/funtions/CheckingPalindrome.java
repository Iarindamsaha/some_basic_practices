package com.funtions;

public class CheckingPalindrome {

    public static void palindromeCheck(int number){

        int temp = number;
        int rev =0 ;
        while(number!=0){

            int rem = number%10;
            rev = rev*10+rem;
            number = number / 10;
        }
        if(rev == temp ){
            System.out.println(temp + " : The Number is a Palindrome");
        }
        else {
            System.out.println(temp+ " : The Number is Not a Palindrome");
        }


    }

    public static void main(String[] args) {
        palindromeCheck(121);
    }
}
