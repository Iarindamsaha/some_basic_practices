public class ReverseANumber {

    public static void main(String[] args) {
        int in = 1899, remain,reverse = 0;
        while (in != 0){
            remain= in %10;
            reverse = reverse*10+remain;
            in=in/10;

        }
        System.out.println(reverse);

    }
}
