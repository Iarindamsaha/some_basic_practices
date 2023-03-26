package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.IntStream;
import java.util.stream.Stream;



public class StreamDemo2 {

    public static void main(String[] args) {

        Stream<Objects> emptyStream = Stream.empty();
        emptyStream.forEach(e-> System.out.println(e));

        // array,object,collection
        String name[] = {"Arindam", "Saha","Demo"};
        Stream<String> names = Stream.of(name);
        names.forEach(e-> System.out.println(e));

        //Using Builder and Build Method
        Stream<String> streamy = Stream.<String>builder().add("Arindam").add("Saha").add("Build").build();
        streamy.forEach(e-> System.out.println(e));

        //3 Creating an IntStream
        IntStream stream  = Arrays.stream(new int[]{2,5,6,8});
        stream.forEach(e -> System.out.println(e));

        //5 Using List
        List<Integer> intList = new ArrayList<>();
        intList.add(5);
        intList.add(7);
        intList.add(12);
        Stream<Integer> stream1 = intList.stream();
        stream1.forEach(e -> System.out.println(e));


    }


}
