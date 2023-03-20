package com.funtions;

public class PrimeOrNot {
    public static boolean primeNumberCheck(int n){

        if(n == 2){
            return true;
        }

        int flag = 0;
        for (int i = 2; i <= n-1; i++){
            if( n % i == 0){
                flag ++;
            }
        }
        if(flag == 0 ){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {

        int a = 5;
        boolean n = primeNumberCheck(a);
        System.out.println(n);

    }
}
