package com.advancePattern;

public class AdvancedPatters {

    public static void hollowRectangle(int rows, int columns){

        for (int i =1 ; i <= rows; i++){
            for(int j = 1; j <= columns; j++){
                if(i==1||i==rows||j==1||j==columns){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    public static void invertedAndRotatedHalfPyramid(int rowNumber){

        //lines
        for (int i = 1; i <= rowNumber; i++){
            //spaces
            for (int j = 1; j <= rowNumber-i; j++) {
                System.out.print(" ");
            }
            //stars
            for (int g = 1 ; g <= i; g++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void invertedNumberHalfPyramid(int rows){
        for (int i = 1; i <= rows; i++){
            for (int j = 1; j <= rows-i+1 ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void floydsTriangle(int rows){
        int counter = 1;
        for (int i = 1; i<=rows; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(counter+ " ");
                counter++;
            }
            System.out.println();
        }
    }

    public static void triangle0_1(int rows){

        for(int i =1; i <= rows; i++){
            for(int j =1; j <= i; j++){
                if((i+j) % 2 == 0){
                    System.out.print("1");
                }
                else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    public static void butterfly(int rows){

        //first-half
        for(int i = 1 ; i <= rows; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            for(int j = 1; j <= 2*(rows-1); j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = rows; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            for(int j = 1; j <= 2*(rows-1); j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();

        }

    }

    public static void solid_rhombus(int rows){
        for(int i = 1; i <= rows; i++){
            for(int j =1; j <= (rows-i); j++){
                System.out.print(" ");
            }

            for(int j = 1; j <= rows; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void hollowRhombus(int rows, int column){
        for (int i = 1; i <= rows; i++){
            for (int j = 1; j <= (rows-i); j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= column; j++){
                if(i == 1 || i ==rows || j == 1 || j == column){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void diamond(int rows){
        //first-half lines
        for(int i = 1; i <= rows; i++){
            //spaces before print
            for(int j = 1; j <= rows-i ; j++){
                System.out.print(" ");
            }
            //printing stars
            for (int j = 1; j <= (2*i)-1; j++ ){
                System.out.print("*");
            }
            System.out.println();
        }
        //second-half lines
        for(int i = rows; i >= 1; i--){
            //spaces before print
            for(int j = 1; j <= rows-i ; j++){
                System.out.print(" ");
            }
            //printing stars
            for (int j = 1; j <= (2*i)-1; j++ ){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {

        //hollowRectangle(4,5);

        //invertedAndRotatedHalfPyramid(4);

        invertedNumberHalfPyramid(5);

        //floydsTriangle(4);

        //triangle0_1(10);

        //butterfly(4);

        //solid_rhombus(5);

        //hollowRhombus(4,5);

        //diamond(7);


    }



}
