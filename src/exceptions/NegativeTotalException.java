package exceptions;

public class NegativeTotalException extends Exception {
    public NegativeTotalException(String name) {
        System.out.println("EXCEPTION: Negative total not allowed! customer: " + name);
    }
}
