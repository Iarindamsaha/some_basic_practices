package args;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.stream.Stream;



public class HashTable {
    public static void main(String[] args) {
        Hashtable<String,Integer> hashtable = new Hashtable();
        hashtable.put("Suii",99);
        System.out.println(hashtable);
        HashMap<String,Integer> hashMap = new HashMap<>();
        hashMap.put(null,null);
        System.out.println(hashMap);
    }
}
