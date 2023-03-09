package org.cfppractice;

public class PrimeNumberFromArray {
    public static void main(String[] args) {

        int[] arr = {1,7,23,22,24,4,3,5,63,33};
        int flag = 0, m=0;

        for (int i : arr){
            m = i/2;
            if(i==0||i==1){
                System.out.println(i+" is not a prime number");
            }
            else {
                for(int j = 2; j <= m; j++ ){
                    if (i % j == 0){
                        System.out.println(i+ " is not a prime number ");
                        flag = 1;
                        break;
                    }
                }
            }
            if ( flag == 0){
                System.out.println(i + " is a prime number ");
            }

        }
    }
}
