package oop;

public class Cat {
    static int counter;
    static String furColor;

    String name;
    double weight;
    int age;

    Cat(String name, double weight, int age) {
        this.name=name;
        this.weight=weight;
        this.age=age;
        Cat.counter++;
    }
}
