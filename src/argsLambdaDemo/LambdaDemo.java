package argsLambdaDemo;

import java.util.Arrays;

public class LambdaDemo {
    public static void main(String[] args) {
        LambdaD even = (int[] arr) -> {

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 == 0) {

                    System.out.println(arr[i]);

                }
            }

        };

        even.even(new int[]{1, 2, 3, 5, 6, 8});

    }
}
