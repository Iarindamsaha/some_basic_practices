package argsPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionPractice {

    public void replaceCharUsingStream(List<String> arr, char old, char replaceWith){

        System.out.println(arr.stream().map(i->i.replace(old,replaceWith)).toList());

    }

    public void replaceCharNormal(List<String> arr, char old, char replaceWith){

        for (String s : arr) {

            String gg = s.replace(old, replaceWith);
            System.out.println(gg);

        }

    }

    public void countCharFormList(List<String> arr, char find){
        String temp = "";
        for(int i = 0 ; i < arr.size(); i++){
            temp = temp + arr.get(i);
        }
        int count = 0;
        for(int i = 0; i < temp.length(); i++){
            if(temp.charAt(i) == find){
                count++;
            }
        }
        System.out.println(find + " = " + count);
    }

    public void countCharsStream(List<String> arr, String find){

        System.out.println(arr.stream().filter(i -> i.contains(find)).count());

    }

    public static void main(String[] args) {

        CollectionPractice obj = new CollectionPractice();
        List<String> review = new ArrayList<>();
        Collections.addAll(review,"Hello","Arindam","Welcome","Matrix","World");
        obj.replaceCharUsingStream(review,'r','o');
//        obj.countCharsStream(review,"l");



    }
}
