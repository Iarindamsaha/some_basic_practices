import java.util.Arrays;
import java.util.Scanner;

public class ArrayOfString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String arr[] = new String[4];



        for(int i = 0; i < arr.length; i++){
            System.out.println("Enter The Value");
            String input = sc.next();
            arr[i]=input;
        }

        System.out.println(Arrays.toString(arr));

        //for (int i = 0 ; i < arr.length; i++){
        //    System.out.println(arr[i]);
        //}

        System.out.println("After Sorting");
        for (int i =0 ; i < arr.length ; i++){
            for(int j =0 ; j < arr.length; j++){
                if(arr[i].compareTo(arr[j]) < 0){
                    String temp = arr[j];
                    arr[j]= arr[i];
                    arr[i]= temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
