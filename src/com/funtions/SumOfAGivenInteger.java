package com.funtions;

public class SumOfAGivenInteger {

    public void sumOfGivenNumber(int number){

        int sum = 0;
        int rem = 0;
        while(number != 0){

            rem = number % 10;
            sum = sum + rem;
            number = number / 10;

        }

        System.out.println(sum);
    }

    public static void main(String[] args) {

        SumOfAGivenInteger obj = new SumOfAGivenInteger();
        obj.sumOfGivenNumber(247);

    }
}
