package com.practiceRandom;

public class SomeNumbers {
    public void gettingSomeMaxNumbers(int[] arr){
        int check,secondcheck,thirddcheck;
        int greater = 0;
        int secondgreater = 0;
        int thirdgreater = 0;

        for(int i = 0; i < arr.length;i++){
            check = arr[i];
            for(int j=0; j<arr.length;j++){

                if (check > arr[j] && check > greater) {
                    greater = check;
                    break;
                }
            }
        }
        System.out.println("Greatest Number : "+greater);

        for(int i = 0; i<arr.length;i++){
            secondcheck = arr[i];

            for(int j=0; j<arr.length;j++){
                if (secondcheck > arr[j] && secondcheck < greater && secondcheck > secondgreater) {
                    secondgreater = secondcheck;
                    break;
                }
            }
        }
        System.out.println("2nd Greatest Number : "+secondgreater);

        for(int i = 0; i<arr.length;i++){
            thirddcheck = arr[i];

            for(int j=0; j<arr.length;j++){
                if (thirddcheck > arr[j] && thirddcheck < greater && thirddcheck < secondgreater && thirddcheck > thirdgreater) {
                    thirdgreater = thirddcheck;
                    break;
                }
            }
        }
        System.out.println("3rd Greatest Number : "+thirdgreater);
    }

    public static void main(String[] args) {
        SomeNumbers arr = new SomeNumbers();
        int[] array = {203,405,65,73,28,98};

        arr.gettingSomeMaxNumbers(array);

    }
}

