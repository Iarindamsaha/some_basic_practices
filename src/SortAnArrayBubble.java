import java.util.Arrays;

public class SortAnArrayBubble {
    public static void bubbleSort(int arr[]) {

        for (int turn = 0; turn < arr.length - 1; turn++) {
            int swap = 0;
            if(swap>=0) {
                for (int j = 0; j < arr.length - 1 - turn; j++) {
                    if (arr[j] > arr[j + 1]) {
                        //swap
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                        swap++;

                    }
                }
            }
            else {
                System.out.println("Already Sorted");
                break;

            }

        }
    }
    public static void printSorted(int arr[]){
        for ( int i = 0 ; i < arr.length; i++){
            System.out.print(arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1,2,3,4,5 };
        bubbleSort(arr);
        printSorted(arr);
    }
}
