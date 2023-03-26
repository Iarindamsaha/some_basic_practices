package argsPractice;

import java.lang.reflect.Array;
import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collections;

public class FrequencyOfWord {

    public void countFrequency(ArrayList<String> input, ArrayList<String> findFrequency){


        for (int i = 0 ; i < findFrequency.size(); i++){
            int countWords = 0;
            for(int j = 0; j < input.size(); j++){
                if(input.get(j).equals(findFrequency.get(i))){
                    countWords++;
                }
            }
            System.out.println(findFrequency.get(i) + " Presents " + countWords + " Times in The Array ");

        }

    }

    public static void main(String[] args) {
        FrequencyOfWord obj = new FrequencyOfWord();
        ArrayList<String> checkThis = new ArrayList<>();
        Collections.addAll(checkThis,"Arindam","Saha","Arindam","World","hello","hello","hello");
        ArrayList<String> findThis = new ArrayList<>();
        Collections.addAll(findThis,"Arindam","hello","World");
        obj.countFrequency(checkThis,findThis);
    }
}
