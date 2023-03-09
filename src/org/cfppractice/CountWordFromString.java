package org.cfppractice;

public class CountWordFromString {

    public static void main(String[] args) {
        String trial = "hi    i am  sagar    somwanshi";
        int count = 0;
        for (int i = 0; i < trial.length(); i++) {
            if (String.valueOf(trial.charAt(i)).equals(" ")) {
                count++;
                System.out.println("Count : " + count);
                if (String.valueOf(trial.charAt(i)).equals(String.valueOf(trial.charAt(i - 1)))) {
                    count--;
                }
            }
        }
        if (trial.length() != 0) {
            System.out.println("Word Count : " + (count + 1));
        } else {
            System.out.println("Word Count : 0 ");
        }

    }
}