package args;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class HashMapDemo{
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        LinkedList<Integer> link = new LinkedList<>();

        map.put("Math",78);
        map.put("English",76);
        map.put("Bengali",90);

        System.out.println(map);

        for (Map.Entry<String, Integer> val : map.entrySet()){

            System.out.println("Key = " + val.getKey());
            System.out.println("Value = " + val.getValue());

        }



    }
}
