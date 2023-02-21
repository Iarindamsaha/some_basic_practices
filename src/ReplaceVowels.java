public class ReplaceVowels {
    public static void main(String[] args) {

        String v1[] = {"Arindam","Robin","Charly","Alex"};

        for ( int i =0; i< v1.length; i++){
               String v2 = v1[i].replaceAll("[aeiou]","");
               System.out.println(v2);
           }
        }
        //System.out.println(v1);
}


