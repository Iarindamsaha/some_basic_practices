package org.cfppractice;

import static java.lang.Character.toLowerCase;
import static java.lang.Character.toUpperCase;

public class ChangeCharacterFromStringAdvance {
    public static void main(String[] args) {

        String learn = "This Is A ARindAm saha oreo";
        String newString = "";
        char replace = 0;
        char[] stringConvert = learn.toCharArray();

        for ( int i = 0; i < stringConvert.length; i++){
            char check = stringConvert[i];
                if(toLowerCase(check) == 'a' || toLowerCase(check) == 'e' || toLowerCase(check) == 'i' || toLowerCase(check) == 'o' || toLowerCase(check) == 'u' ){
                    if (Character.isUpperCase(check)){
                        replace = toLowerCase(learn.charAt(i));
                        newString = newString + replace;
                    }
                    if(Character.isLowerCase(check)){
                        replace = toUpperCase(learn.charAt(i));
                        newString = newString + replace;
                    }

                }
                else {
                    newString = newString + check;
                }

        }
        System.out.println(newString);
    }
}
