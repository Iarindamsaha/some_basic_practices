public class CountVowels {
    public static void main(String[] args) {
        String v1 = "Arindam Saha";
        v1 = v1.toLowerCase();
        char v2[] = v1.toCharArray();
        int count = 0 ;

        for(int i = 0 ; i < v2.length; i++){
            if(v2[i] == 'a' || v2[i] == 'e' || v2[i] == 'i' || v2[i] == 'o' || v2[i] == 'u' ){
                count ++;
            }
        }
        System.out.println(count);
    }
}
