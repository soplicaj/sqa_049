package general;

import oop.Cat;
import oop.Number;

public class PrimitiveVsObject {
    public static void main(String[] args) {
//        Cat c1 = new Cat("Cat1",5,4); cannot create - constructor is not public
        Number n1 = new Number(5,10);

        System.out.println("before: " + n1.x);
        changeNumber(1);
        System.out.println("after: " + n1.x);

        System.out.println("before: " + n1.x);
        changeObject(n1);
        System.out.println("after: " + n1.x);
    }

    public static void changeNumber(int x) { ++x; }
    public static void changeObject(Number n) { n.x++; }
}
