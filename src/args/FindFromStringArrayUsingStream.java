package args;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindFromStringArrayUsingStream {
    public static void main(String[] args)
    {
        List<String> words = new ArrayList<>();
        words.add("go");
        words.add("me");
        words.add("boy");
        words.add("ate");
        words.add("mate");
        words.add("goal");

        List<String> result = words.stream()
                .filter(word -> isMatch(word))
                .collect(Collectors.toList());
        System.out.println(result);
    }

    static boolean isMatch(String word) {
        Character[] required_chars =  {'e', 'o', 'b', 'a', 'm', 'g', 'l'} ;
        long count = Arrays.stream(required_chars)
                .filter(ch -> word.contains(ch.toString()))
                .count();
        return count == word.length();
    }
}
