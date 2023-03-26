package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiDemo {

    public static void main(String[] args) {

        List<Integer> numberList = new ArrayList<>();

        numberList.add(35);
        numberList.add(90);
        numberList.add(12);
        numberList.add(28);
        numberList.add(33);
        numberList.add(65);
        numberList.add(45);

        System.out.println(numberList);

        List square = numberList.stream().map(x -> x * x).collect(Collectors.toList());
        System.out.println(square);

        List evens = numberList.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        System.out.println(evens);

        numberList.stream().forEach(t -> System.out.print(t + " "));
        System.out.println();

        List sorted = numberList.stream().sorted().collect(Collectors.toList());
        System.out.println(sorted);


    }
}
