import java.util.Scanner;

public class Test {

        public void arraysortmtd(){
            int check=0;
            int greater = 0;
            int secondgreater = 0;
            int secondcheck = 0;
            int thirddcheck = 0;
            int thirdgreater =0;
            int arr[] = {99,87,67,55,45,33,22,15,11,9,6};

            for(int i = 0; i<arr.length;i++){
                check = arr[i];
                for(int j=0; j<arr.length;j++){

                    while(check > arr[j] && check > greater){
                        greater = check;
                    }
                }
            }
            System.out.println("Greatest Number : "+greater);

            for(int i = 0; i<arr.length;i++){
                secondcheck = arr[i];
                for(int j=0; j<arr.length;j++){
                    while(secondcheck > arr[j] && secondcheck < greater && secondcheck> secondgreater){
                        secondgreater = secondcheck;
                    }
                }
            }
            System.out.println("2nd Greatest Number : "+secondgreater);

            for(int i = 0; i<arr.length;i++){
                thirddcheck = arr[i];
                for(int j=0; j<arr.length;j++){
                    while(thirddcheck > arr[j] && thirddcheck < greater && thirddcheck < secondgreater && thirddcheck >thirdgreater){
                        thirdgreater = thirddcheck;
                    }
                }
            }
            System.out.println("3rd Greatest Number : "+thirdgreater);
        }

        public static void main(String[] args) {
            Test arr = new Test();

            arr.arraysortmtd();

        }
}


