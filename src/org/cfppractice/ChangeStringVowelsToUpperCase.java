package org.cfppractice;

public class ChangeStringVowelsToUpperCase {

    public static void main(String[] args) {

        String testing = "This Is A String to Test";
        char[] stringConvert = testing.toCharArray();
        char[] vowels = {'a','e','i','o','u'};
        char[] vowelsUpper = {'A','E','I','O','U',};

        for (int i = 0; i < stringConvert.length; i++){

            for(int j = 0; j < vowelsUpper.length; j++){
                if(stringConvert[i] == vowelsUpper[j]){
                    char change = Character.toLowerCase(stringConvert[i]);
                    stringConvert[i] = change;

                }
            }

            for (int j = 0; j < vowels.length; j++){
                if(stringConvert[i] == vowels[j]){
                    char upperChange = Character.toUpperCase(stringConvert[i]);
                    stringConvert[i] = upperChange;
                }
            }

        }

        for (char afterChange : stringConvert){
            System.out.print(afterChange);
        }
   }
}
