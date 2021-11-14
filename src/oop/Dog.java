package oop;

public class Dog {
    //attributes
    int age;
    double weight;
    String furColor;

    //constructor
    Dog(int ageP, double weightP, String furColorP) {
        this.age = ageP;
        this.weight = weightP;
        this.furColor = furColorP;
    }

    Dog(){}

    void bark() {
        System.out.println("Woof Woof! I am " + age + " years old and " + weight + " kg heavy!");
    }

    double getFinalWeight(double foodQty) {
        return weight += foodQty * 0.1;
    }
}
