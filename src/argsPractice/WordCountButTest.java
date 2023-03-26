package argsPractice;

import java.util.*;

public class WordCountButTest {
    public static void main(String[] args) {
        ArrayList<String> checkWord = new ArrayList<>();
        Hashtable<String,Integer> test = new Hashtable<>();

        checkWord.add("Arindam");
        checkWord.add("Arindam");
        checkWord.add("World");
        checkWord.add("Hello");
        checkWord.add("Hello");
        checkWord.add("Remove");

        for (int i = 0 ; i < checkWord.size(); i++){
            int count = 0 ;
            for (int j = 0 ; j < checkWord.size(); j++){
                if(checkWord.get(i).equals(checkWord.get(j))){
                    count++;
                }
            }
            test.put(checkWord.get(i),count );
        }
        System.out.println(test);
    }
}
