package exceptions;

import oop.Point;

public class ExceptionsTutor {
    public static void main(String[] args) {
        Point point = null;
        int[] values = new int[5];
        System.out.println("A");
        try {
            int x = 10 / 0;
            System.out.println("B");
            System.out.println(point.x);
            System.out.println("C");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught!");
//            e.printStackTrace();
        } catch (NullPointerException n){
            System.out.println("nullpointer caught!");
//            n.printStackTrace();
        }
        finally {
            System.out.println("Finally!");
        }
        System.out.println("Z");

//MyException
        try {
        m(-100);
    } catch (MyException e) {
        System.out.println(e.getMessage());
    }finally {
        System.out.println("FINALLY BLOCK EXECUTED");
    }
        System.out.println("Z");


        try{
        doSomething();
    }catch (MyException e){
        System.out.println("Print some message");
    }
}

    public static void m(int x) throws MyException{ //I am propagating MyException so the code compiles
        if(x < 0){
            MyException myException = new MyException();
            throw myException;
        }
        System.out.println("EXECUTED!");
    }

    public static void doSomething() throws MyException{
        throw new MyException();
    }
}
