package exceptions;

public class MyException extends Exception{

    public MyException(){
        super("This is MyException - checked exception");
    }
}
