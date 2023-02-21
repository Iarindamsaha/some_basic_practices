public class PracticeSwap {

    static void seg(int arr[],int n){
        int count = 0;
        for(int i = 0 ; i<n; i++ ){
            if(arr[i] == 1){
                count++;
            }
        }
        for (int i = 0 ; i < count; i++){
            arr[i] = 1;
        }

        for (int i = count; i < n; i++){
            arr[i]=0;
        }

        System.out.print("Array after segregation is ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
    public static void main(String[] args) {
        int arr[] = { 0, 1, 0, 1, 0, 1 };
        int n = arr.length;

        seg(arr,n);

    }
}
