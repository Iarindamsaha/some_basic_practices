package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiMain {

    public static void main(String[] args) {

        //Create A arrayList and filter all even number from list

        List<Integer> numberList = new ArrayList<>();

        numberList.add(35);
        numberList.add(90);
        numberList.add(12);
        numberList.add(28);
        numberList.add(33);
        numberList.add(65);
        numberList.add(45);

        System.out.println(numberList);

        //without stream

        List<Integer> evenList = new ArrayList<>();

        for (Integer i : numberList){
            if(i % 2 == 0){
                evenList.add(i);
            }
        }

        System.out.println(evenList);

        //using stream

        Stream<Integer> stream = numberList.stream();
        List<Integer> newList = stream.filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(newList);

        //one Line Only

        List<Integer> newList3 = numberList.stream().filter(i-> i % 2 == 0).collect(Collectors.toList());
        System.out.println(newList3);
        

    }
}
