package org.cfppractice;

import java.util.ArrayList;

public class AddingBalls {

    public static void addingBalls(){

        ArrayList list1 = new ArrayList<>();
        Ball newBall = new Ball();
        Bag bagEntry;

        for(int i = 0; i < 10; i++){

            int rand = (int) (Math.random()*10)%3;

            if(rand == 0){
                bagEntry = new Bag(newBall.ball1);
                list1.add(bagEntry);
            } else if (rand == 1) {
                bagEntry = new Bag(newBall.ball2);
                list1.add(bagEntry);
            }else {
                bagEntry = new Bag(newBall.ball3);
                list1.add(bagEntry);
            }
        }
        System.out.println(list1);
    }

    public static void main(String[] args) {
        addingBalls();
    }

}
class Bag{
    String ballEntry;

    public Bag(String ballEntry) {
        this.ballEntry = ballEntry;
    }

    @Override
    public String toString() {
        return ballEntry;
    }
}
class Ball{

    String ball1 = "RED";
    String ball2 = "GREEN";
    String ball3 = "BLUE";

}

