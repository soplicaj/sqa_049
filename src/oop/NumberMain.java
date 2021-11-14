package oop;

public class NumberMain {
    public static void main(String[] args) {
        Number n1 = new Number(9);
        Number n2 = new Number(1,2);
        Number n3 = new Number("3");
        System.out.println(n1.x + ", " + n1.y);
        System.out.println(n2.x + ", " + n2.y);
        System.out.println(n3.x + ", " + n3.y);
    }
}
