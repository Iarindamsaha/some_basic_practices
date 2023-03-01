package org.cfppractice;

public class ArrayDemo {

    public void demoSort(String arr[], int n){


        for(int i = 0; i < n ; i++) {

            System.out.print(arr[i]);

            if ( n - 4 == i ){
                System.out.print(", ");
            }
            if ( n - 3 == i){
                System.out.print(", ");
            }
            if( n - 2 == i){
                System.out.print(" and ");
            }

        }
        System.out.print(".");


    }

    public static void main(String[] args) {

        ArrayDemo arrayDemo = new ArrayDemo();
        String arr[] = {"BlueBerry","Apple","Pineapple", "Banana"};
        int arrLength = arr.length;
        arrayDemo.demoSort(arr,arrLength);

    }
}
