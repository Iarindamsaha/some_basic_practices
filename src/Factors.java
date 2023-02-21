import java.util.Scanner;

public class Factors {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number");
        int input = sc.nextInt();

        for(int i = 2; i<input; i++){

            while(input%i == 0){

                System.out.print(i+",");
                input=input/i;

            }
        }
        if(input>2){
            System.out.println(input);
        }
        sc.close();

    }
}
