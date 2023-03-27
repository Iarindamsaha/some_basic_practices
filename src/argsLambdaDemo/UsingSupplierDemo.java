package argsLambdaDemo;

import java.util.function.Supplier;

public class UsingSupplierDemo {

    Supplier<Integer> sum = () -> {
        int a =90;
        int b =70;
        return a+b;
    };

    public static void main(String[] args) {
        UsingSupplierDemo obj = new UsingSupplierDemo();
        System.out.println(obj.sum.get());
    }
}
