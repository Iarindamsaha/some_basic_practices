package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamApi {

    public static void main(String[] args) {

        //Stream Of Function
        Stream<Integer> stream = Stream.of(12,34,54,12,98,67,55);
        stream.forEach(System.out::println); //System.out::println == (e->System.out.println(e))

        //Stream Of Arrays
        Stream<Integer> stream1 = Stream.of(new Integer[] {1,2,3,4,5,6,7});
        stream1.forEach(System.out::println);

        //Random Number Stream
        Stream<Integer> randomStream = Stream.generate(() -> (new Random()).nextInt(100));
        randomStream.limit(20).forEach(System.out::println);

        //Stream of String Chars
        IntStream stream2 = "abcdefg".chars();
        stream2.forEach(System.out::println);

        Stream<String> stream3 = Stream.of("A$B$C".split("\\$"));
        stream3.forEach(p -> System.out.println(p));

        //Collectors
        List<Integer> l1 = new ArrayList<>();

        for(int i = 0; i<= 25 ; i++){
            l1.add(i);
        }

        Stream<Integer> s1 = l1.stream();
        List<Integer> l2 = s1.filter(e->e%2==0).collect(Collectors.toList());
        System.out.println(l2);

        //Filter And Sorted

        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Berry");
        fruits.add("Grapes");
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("Pomegranate");
        fruits.add("Peaches");

        fruits.stream().filter(e->e.startsWith("P")).forEach(e -> System.out.print(e + " "));
        System.out.println();
        List<String> filteredList = fruits.stream().filter(e->e.startsWith("B")).collect(Collectors.toList());
        System.out.println(filteredList);

        //Sorted
        fruits.stream().sorted().map(String::toUpperCase).forEach(System.out::println);

        //Match
        boolean matchResults = fruits.stream().anyMatch(s->s.startsWith("B"));
        System.out.println(matchResults);
        boolean matchResults2 = fruits.stream().anyMatch(s->s.startsWith("N"));
        System.out.println(matchResults2);

        //Count
        long total = fruits.stream().filter(e->e.startsWith("P")).count();
        System.out.println(total);

        //Reduce == The reduce() method performs a reduction on the elements of the stream with the given function.
        // The result is an Optional holding the reduced value.
        Optional<String> reduced = fruits.stream().reduce((s3,s2)-> s3+ "#" +s2);
        reduced.ifPresent(System.out::println);
    }
}
