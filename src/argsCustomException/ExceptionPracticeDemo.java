package argsCustomException;

public class ExceptionPracticeDemo {

    public static int sum (int a , int b){
        return a + b;
    }

    public static void main(String[] args) {


        try{
            int a =30;
            int b =40;
            int c = sum(a,b);
            if(c > 20){
                throw new CustomExp("Value is Greater Than 20", CustomExp.Exception_Type.VALUE_GREATER_THAN_20);
            }
            else {
                System.out.println(c);
            }
        } catch (CustomExp e) {
            System.out.println(e.getMessage());
        }
    }
}
