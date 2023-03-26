package stream;

import java.util.List;
import java.util.stream.Collectors;

public class StreamApiMethodsDemo2 {

    public static void main(String[] args) {

        /*
        filter(predicate)
        boolean value function e->

        map(function)
        -->each element operation
        */

        //filter
        List<String> names = List.of("Arindam","Hello","Java");
        List<String> names1= names.stream().filter(e->e.startsWith("H")).collect(Collectors.toList());
        System.out.println(names1);

        //map
        List<Integer> names2 = List.of(2,8,9,3);
        List<Integer> names7 = names2.stream().map(i -> i*i).collect(Collectors.toList());
        System.out.println(names7);

        //foreach
        names.stream().forEach(e-> System.out.println(e));

        //sorted
        names2.stream().sorted().forEach(System.out::println);

        //min
        Integer integer= names2.stream().min((x,y)->x.compareTo(y)).get();
        System.out.println("min" + integer);


    }
}
