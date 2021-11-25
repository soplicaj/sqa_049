package generics_collections;

import oop.Point;

public class GenericsTutor {
    public static void main(String[] args) {
        NewObject<String> newObject = new NewObject<>();
        //it enforces a strict limitation regarding the data-type
        //for the attribute OF THIS instance
        newObject.newAttribute = "Some new value";
        System.out.println(newObject.newAttribute);

        NewObject<Integer> newObject1  = new NewObject<Integer>(10);
        newObject1.newAttribute = 20;
        System.out.println(newObject1.newAttribute);
        System.out.println(newObject1.newAttribute.getClass());

        NewObject<Point> newObject2 = new NewObject<>();
        newObject2.newAttribute = new Point(1,1);

        NewObject<? extends Number> newObject3;
        //enforcing a certain limitation regarding the data type of T attribute
        newObject3 = new NewObject<Integer>();
        newObject3 = new NewObject<Double>();
        newObject3 = new NewObject<Byte>();
        //newObject3 = new NewObject<String>();
        //this can not be used since String doesn't inherit Number

        NewObject<? super Integer> newObject4;
        //both super and extends offer flexibility
        newObject4 = new NewObject<Integer>();
        newObject4 = new NewObject<Number>();
        newObject4 = new NewObject<Object>();
//        newObject4 = new NewObject<Point>();

        NewObject<?> newObject5;  //the least restrictive way
        newObject5 = new NewObject<Point>();
        newObject5 = new NewObject<Integer>();
        newObject5 = new NewObject<String>();
    }
}