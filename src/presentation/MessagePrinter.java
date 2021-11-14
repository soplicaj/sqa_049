package presentation;

public class MessagePrinter {

    public static final String HELLO_MESSAGE = "HELLO WORLD!";

    public String returnHello() {
        return HELLO_MESSAGE;
    }
    public void sayHello() {
        System.out.println(HELLO_MESSAGE);
    }
}
