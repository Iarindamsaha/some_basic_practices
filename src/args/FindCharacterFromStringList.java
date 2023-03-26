package args;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class FindCharacterFromStringList {

    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Hello");
        arr.add("Arindam");
        arr.add("lemon");

        char find = 'a';
        System.out.println(arr.stream().filter(s-> s.indexOf(find) != 1).findFirst());
    }
}
