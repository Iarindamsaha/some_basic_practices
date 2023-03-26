package argsPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseAndStoreInt {

    public void revAndStore(ArrayList<Integer> review){
        for (int i = 0 ; i < review.size(); i++){

            int temp = review.get(i);
            int remainder,rev = 0;

            while(temp!= 0){
                remainder = temp % 10;
                rev = rev*10 + remainder;
                temp = temp/10;
            }

            review.set(i,rev);
        }
        System.out.println(review);
    }

    public static void main(String[] args) {
        ReverseAndStoreInt obj = new ReverseAndStoreInt();
        ArrayList<Integer> check = new ArrayList<>();
        check.add(203);
        check.add(1998);
        check.add(2002);
        obj.revAndStore(check);
    }
}
