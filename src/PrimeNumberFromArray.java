public class PrimeNumberFromArray {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,7,8,12,13};

        for (int i = 0 ; i < arr.length; i++){
            boolean primeValue = true;
            if (arr[i] == 1){
                primeValue = false;
            }
            else {
                for(int j = 2 ; j<=arr[i]/2; j++){
                    if (arr[j] % j == 0){
                        primeValue=false;
                        break;
                    }
                }
            }
            if(primeValue){
                System.out.println(arr[i] + " is a prime number");
            }
        }

    }
}
