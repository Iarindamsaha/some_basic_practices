public class ReplaceVowels {
    public static void main(String[] args) {

        String v1[] = {"Arindam","Robin","Charly","Alex"};

        for ( int i =0; i< v1.length; i++){
               String v2 = v1[i].replaceAll("[aeiou]","");
               System.out.println(v2);
           }
        String v2 = "Arindam Saha";
        String v3 = v2.replaceAll("[aeiou]"," ");
        System.out.println(v3);
        }

        //System.out.println(v1);

}


