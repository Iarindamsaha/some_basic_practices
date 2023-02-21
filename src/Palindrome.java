import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sum = 0, r;
        System.out.println("Enter A Number To Check");
        int input = sc.nextInt();
        int temp = input;

        while (temp > 0) {

            r = temp % 10; //getting the remainder of the number
            sum = (sum * 10) + r;
            temp = temp / 10;

        }
        if (input == sum) {
            System.out.println("The Number is A Palindrome Number");
        } else {
            System.out.println("The Number is Not A Palindrome Number");
        }
    }
}
