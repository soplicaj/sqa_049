package oop;

public class PointMain {
    public static void main(String[] args) {
        Point p1 = new Point(1,1);
        Point p2 = new Point(2,2);
        System.out.println(distanceBetweenAB(p1, p2));
    }

    static double distanceBetweenAB(Point a, Point b) {
        return Math.sqrt(Math.pow((b.x - a.x),2) + Math.pow((b.y - a.y), 2));
    }
}
