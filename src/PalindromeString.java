import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A String Value");
        String input = sc.next();
        String rev = "";
        char arr[] = input.toCharArray();
        for(int i = 0 ; i < arr.length; i++){
            rev=arr[i]+rev;
        }
        //System.out.println(rev);

        if(input.equals(rev)){
            System.out.println("The String is Palindrome");
        }
        else {
            System.out.println("The String is Not Palindrome");
        }
    }
}
