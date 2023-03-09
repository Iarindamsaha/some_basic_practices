package org.cfppractice;

public class EvenOddFromArray {

    public static void main(String[] args) {
        int[] arr = {2,5,3,4,6,8,7};
        for (int i : arr){
            if(i % 2 == 0){
                System.out.println(i+" is a even number");
            }
            else {
                System.out.println(i+" is a odd number");
            }
        }
    }
}
