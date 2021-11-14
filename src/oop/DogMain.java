package oop;

public class DogMain {
    public static void main(String[] args) {
        Dog Szarik = new Dog();
        Szarik.age = 3;
        Szarik.weight = 32.5;
        Szarik.furColor = "golden";
        Dog Leon = new Dog(5, 12.3, "black");
        Dog d3 = Szarik;
        System.out.println("Szarik is " + Szarik.age);
        d3.age = 5;
        System.out.println("Szarik is " + Szarik.age);
        Szarik.bark();
        Leon.bark();
        System.out.println("Szarik now is " + Szarik.getFinalWeight(9) + " kg");
        System.out.println("Leon now is " + Leon.getFinalWeight(20) + " kg");
    }
}
