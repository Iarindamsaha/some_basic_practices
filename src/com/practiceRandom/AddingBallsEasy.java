package com.practiceRandom;

import java.util.ArrayList;
import java.util.List;

public class AddingBallsEasy {

    static List bag = new ArrayList<>();

    public static void addBalls(String[] arr){

        for(int i = 0 ; i < 10 ; i++){
            int someRandomNumber = (int)(Math.random()*10)%3;
            bag.add(arr[someRandomNumber]);
        }

    }
    public static void displayBag(){

        System.out.println(bag);

    }

    public static void main(String[] args) {

        addBalls(new String[]{"RED", "GREEN", "BLUE"});
        displayBag();

    }
}
