package oop.abstract_concepts.interfaces;
//    Interface Driver()
//    - method drives();
//    - method steer(String direction)
public interface Driver {
    default void drives(){
        System.out.println("default drive");
    }

    default void steer(String direction) {
        System.out.println("car steers to the " + direction);
    }
}
