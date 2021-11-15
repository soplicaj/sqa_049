package oop.inheritance;

public class Circle extends Point2D{
    private double radius; //adding new attributes

    public Circle(int x, int y, double radius){
        super(x, y); //the super() needs to be the first instruction in a Constructor
        //Calling the constructor from Point2D
        this.radius = radius;
    }

    public Circle(){
//        super(10, 10); //I can not have both super() and this() in a constructor because they both
        //require to be the first instruction my constructor
        this(1, 1, 5);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculateSurface(){ //adding new behaviours
        return Math.pow(this.radius, 2) * Math.PI;
    }
}