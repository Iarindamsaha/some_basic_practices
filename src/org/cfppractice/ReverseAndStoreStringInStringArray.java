package org.cfppractice;

public class ReverseAndStoreStringInStringArray {

    public String[] reverseStringArray(String[] arr){
        String renew = "";
        String[] after = new String[arr.length];

        for (int i = 0; i < arr.length; ++i){
            char[] result = arr[i].toCharArray();
            for (char next : result){
               renew = next + renew;
            }
            after[i] = renew;
            renew = "";
        }
        return after;
    }

   public void printMethod (String[] arr){
        String comma = "";
       for ( String s : arr){
           System.out.print(comma+s);
           comma =",";
       }
       System.out.println(".");
    }

    public static void main(String[] args) {

        ReverseAndStoreStringInStringArray result = new ReverseAndStoreStringInStringArray();
        String[] value = {"Hello", "Arindam", "how", "Are", "You"};
        result.printMethod(result.reverseStringArray(value));

    }
}
