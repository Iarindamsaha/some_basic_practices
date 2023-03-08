public class CountVowelsUsingOneCount {

    public static void main(String[] args) {

        String sentence = "This is a sentence carefully created";
        char[] vars = {'A','e','i','o','u'};

        for (int i = 0; i<vars.length; i++){
            int count = 0;

            for(int j = 0; j<sentence.length(); j++){
                if(sentence.charAt(j) == vars[i]){

                    count ++ ;

                }
            }
            System.out.println( vars[i] + " " + count);
        }
    }
}
