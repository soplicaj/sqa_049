package oop;

public class PolygonMain {
    public static void main(String[] args) {
        Point p1 = new Point(1,1);
        Point p2 = new Point(2,3);
        Point p3 = new Point(3,4);
        Point[] points = {p1, p2, p3};
        Polygon pl1 = new Polygon(points);
        System.out.println(pl1.points[0].x);
        //HOMEWORK: Modify the Polygon class in a way that will allow to build an instance of the Polygon class
        //using the same coordinates as a previously created instance
        //When I am modifying the values of points from the new instance I DON'T WANT the operation to reflect
        //on the initial instance as well
    }
}
