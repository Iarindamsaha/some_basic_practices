package com.loops;

public class RemoveFromString2 {

    public static void main(String[] args) {

        String str = "This is a testing String";
        String newStr = null;
        System.out.println(str.replace("i",""));
        for(int i = 0; i<str.length();i++){
            if(str.charAt(i) == 'i'){
                newStr = str.replace(str.charAt(i),' ');
            }
        }

        System.out.println(newStr);
    }
}
