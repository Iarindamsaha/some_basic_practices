package com.practiceRandom;

public class VowelFromStringArr {

    public static void gettingVowels(String[] arr, char[] vowels){
        String temp = "";
        for(int i = 0; i < arr.length; i++){
            temp = temp + arr[i] ;
        }

        for (int i = 0; i < vowels.length; i++){
            int count = 0;

            for (int j = 0 ; j < temp.length(); j++){
                if(temp.charAt(j) == vowels[i]){

                    count++;

                }
            }
            System.out.println(vowels[i]+" = "+count);
        }

    }

    public static void main(String[] args) {

        String[] arr = {"HAAppy", "Sad", "Mad", "tutorial", "banana", "opera"};
        char[] arr2 = {'A','e','i','o','u'};

        gettingVowels(arr,arr2);
    }
}
