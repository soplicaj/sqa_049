import presentation.MessagePrinter;

/** Author: Jcek Balicki
 *
 *
 *
 */

public class HelloWorld {
    public static void main(String[] args){
        MessagePrinter messagePrinter = new MessagePrinter();
        System.out.println(messagePrinter.returnHello());
        messagePrinter.sayHello();
//        System.out.println("Hello World!");
    }
}
