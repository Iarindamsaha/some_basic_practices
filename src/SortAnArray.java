import java.util.Arrays;

public class SortAnArray {
    public static void main(String[] args) {
        int[] arr = {5, -2, 23, 7, 87, -42, 509};
        System.out.println("The original array is: ");

        for (int i = 0 ; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        Arrays.sort(arr);

        System.out.println("\nThe sorted array is: ");

        for (int i = 0 ; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
