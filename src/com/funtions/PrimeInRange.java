package com.funtions;

public class PrimeInRange {

    public static boolean isPrime(int n){
        if (n == 2){
            return true;
        }

        for (int i = 2; i <= Math.sqrt(n); i++){

            if( n % i == 0){
                return false;
            }
        }

        return true;
    }

    public static void primeInRange(int number){

        for (int i = 2; i <= number ; i++ ){

            if(isPrime(i)){
                System.out.print(i+"  ");
            }
        }

        System.out.println(" END ");
    }

    public static void main(String[] args) {
        primeInRange(118);
    }
}
