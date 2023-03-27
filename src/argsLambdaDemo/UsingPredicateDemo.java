package argsLambdaDemo;

import java.util.function.Predicate;
import java.util.regex.Pattern;

public class UsingPredicateDemo {

    Predicate<String> userCheck = name -> {

        boolean result = name.matches("^[A-Z]{1}[a-z]{3,}$");
        return result;
    };

    public static void main(String[] args) {
        UsingPredicateDemo obj = new UsingPredicateDemo();
        String name = "Arindam";
        if(obj.userCheck.test(name)){
            System.out.println("The Name is Valid");
        }
        else {
            System.out.println("The Name is Not Valid");
        }
    }
}
