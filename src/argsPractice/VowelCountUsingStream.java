package argsPractice;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class VowelCountUsingStream {
    public static void main(String[] args) {
        ArrayList<String> lis = new ArrayList<>();
        lis.add("My name is sagar");
        AtomicInteger vowelCount  = new AtomicInteger();

        lis.stream().forEach(x -> {
            for(int i = 0;i<x.length(); i++ ) {
                String check = String.valueOf(x.charAt(i));
                if(check.equalsIgnoreCase("a") || check.equalsIgnoreCase("e") || check.equalsIgnoreCase("i") || check.equalsIgnoreCase("o") || check.equalsIgnoreCase("u")) {
                    System.out.print(check +",");
                    vowelCount.getAndIncrement();

                }
            }

        });
        System.out.println("\nTotal Vowels : "+vowelCount);
    }
}
