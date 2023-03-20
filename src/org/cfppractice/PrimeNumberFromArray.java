package org.cfppractice;

public class PrimeNumberFromArray {
    public static void main(String[] args) {

        int[] arr = {7,23,22,24,4,3,5,63,33};
        int m;

        for (int i : arr){
            int flag = 0;



                for(int j = 2; j < i ; j++ ){

                    if (i % j == 0){
                        System.out.println(i+ " is not a prime number ");
                        flag = 1;
                        break;
                    }
                }

            if ( flag == 0){
                System.out.println(i + " is a prime number ");
            }

        }
    }
}
