package org.cfppractice;

public class PrineNumberFromAnArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,};

        for(int i =0; i<arr.length;i++){
            int check = 0;
            int prime = arr[i];
            if (prime == 1){
                check=1;
            }
            else {
                for(int j = 2;j<(prime);j++){

                    if(prime % j == 0){
                        check =1;

                    }

                }
            }

            if(check != 1){
                System.out.println(prime+ " is prime number");
            }else{
                System.out.println(prime+ " is not prime number");
            }

        }
    }
}
