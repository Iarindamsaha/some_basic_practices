package argsLambdaDemo;

import java.util.function.Function;

public class UsingFunctionDemo {

    Function<Integer, Integer> sum = sumRes -> sumRes * sumRes;



    public static void main(String[] args) {

        UsingFunctionDemo obj = new UsingFunctionDemo();
        System.out.println(obj.sum.apply(5));
    }
}
