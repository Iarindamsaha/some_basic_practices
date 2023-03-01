public class VowelsFromString {

    public static void main(String[] args) {

        int countA = 0;
        int countE = 0;
        int countI = 0;
        int countO = 0;
        int countU = 0;

        String sentence = "This is a testing statement for vowel count in the statement on java";

        for(int i = 0 ; i < sentence.length(); i++){

            if( sentence.charAt(i) == 'a'){

                countA++;

            }

            if( sentence.charAt(i) == 'e'){

                countE++;

            }

            if( sentence.charAt(i) == 'i'){

                countI++;

            }

            if( sentence.charAt(i) == 'o'){

                countO++;

            }

            if( sentence.charAt(i) == 'u'){

                countU++;

            }





        }

        System.out.println("Number of A in The Sentence = " + countA);
        System.out.println("Number of E in The Sentence = " + countE);
        System.out.println("Number of I in The Sentence = " + countI);
        System.out.println("Number of O in The Sentence = " + countO);
        System.out.println("Number of U in The Sentence = " + countU);

    }
}
