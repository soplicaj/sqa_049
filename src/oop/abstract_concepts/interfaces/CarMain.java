package oop.abstract_concepts.interfaces;

public class CarMain {
    public static void main(String[] args) {
        Golf Golf1 = new Golf(30,"Germany");
        Driver Golf2 = new Golf(20,"Poland");
        Car Golf3 = new Golf(10,"Romania");

        System.out.println("Golf:");
        Golf1.build();
        Golf1.steer("left");
        Golf1.drives();

        System.out.println("Driver:");
//        Golf2.build();
        Golf2.steer("left");
        Golf2.drives();

        System.out.println("Car:");
        Golf3.build();
//        Golf3.steer("left");
//        Golf3.drives();
    }
}
