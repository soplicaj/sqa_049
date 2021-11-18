package oop.abstract_concepts.interfaces;
//        Class Golf - that will use both Car, Driver (Golf extends Car implements Driver)
//
//        Create a CarMain.java - create three instances from the class Golf and use a reference of Car,
//        a reference of Driver and a reference of Golf.
//        - What methods are available from each reference storing a Golf instance?
public class Golf extends Car implements Driver {
    @Override
    public void drives() {
        System.out.println("Golf drives");
    }

    @Override
    public void steer(String direction) {
        System.out.println("Golf steers to the " + direction);
    }

    @Override
    public void build() {
        System.out.println("a Golf is built");
    }

    public Golf(int tank, String producer) {
        this.tank=tank;
        this.producer=producer;
    }
}
