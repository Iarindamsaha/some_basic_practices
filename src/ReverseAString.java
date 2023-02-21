import java.util.Arrays;

public class ReverseAString {
    public static void main(String[] args) {
        String name = "Arindam Saha";
        String out = "";
        char arr[] = name.toCharArray();

        System.out.println(name);
        System.out.println(Arrays.toString(arr));

        for(int i = 0; i < arr.length; i++){

            out=arr[i]+out;

        }
        System.out.println(out);
    }
}
