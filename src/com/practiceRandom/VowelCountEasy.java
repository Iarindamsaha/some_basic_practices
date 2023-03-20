package com.practiceRandom;

public class VowelCountEasy {

    public static void gettingVowels(String[] arr, char[] vowels){
        int count = 0;
        String merged = "";

        for (int i = 0; i < arr.length; i++){
            merged = merged + arr[i];
        }

        for (int i = 0;  i < merged.length(); i++){
            for (int j = 0 ; j < vowels.length; j++){
                if(merged.charAt(i) == vowels[j]){
                    count++;
                }
            }
        }

        System.out.println(count);
    }

    public static void main(String[] args) {

        String[] arr = {"HAppy", "Sad", "Mad", "tutorial", "banana", "opera"};
        char[] arr2 = {'A','e','i','o','u'};

        gettingVowels(arr,arr2);
    }
}
