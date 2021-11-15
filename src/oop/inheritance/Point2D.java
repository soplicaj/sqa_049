package oop.inheritance;

public class Point2D {
    private int x; //x, y - are NOT inherited by Circle because they are private in Point2D
    private int y; //however - they are accessible through getters and setters
    int z = 25; //z is inherited by the Circle class

    public Point2D(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void displayPoint(){
        System.out.println(this.x + " " + this.y);
    }
}