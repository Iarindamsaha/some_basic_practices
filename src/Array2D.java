import java.util.Arrays;

public class Array2D {
    public static void main(String[] args) {
        int arr[][] = new int[7][4];
        int val = 10;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                arr[j][i]=val;
                val++;
            }
        }


        for(int i = 0; i< arr.length; i++){
            for(int j = 0; j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
