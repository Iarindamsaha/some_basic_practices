package argsCustomException;

public class CustomExp extends Exception{
    enum Exception_Type {
        VALUE_GREATER_THAN_20
    }

    Exception_Type type;


    public CustomExp(String message, Exception_Type type) {
        super(message);
        this.type = type;
    }
}
