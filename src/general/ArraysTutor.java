package general;

import oop.Point;

public class ArraysTutor {
    public static void main(String[] args) {
        int[] x =new int[5];
        for (int i=0; i<x.length; i++) {
            x[i]=i+1;
        }

        for (int i:x) {
            System.out.print(i + ", ");
        }
        System.out.println("");

        Point[] collection = new Point[5];
        collection[0] = new Point(1,1);
        collection[1] = new Point(2,3);

        for (Point p:collection) {
            if (p!=null) {
                System.out.println(p.x + " " + p.y);
            }
        }

        //For q1 - calculate the total sum of the elements in the array
        //For q1 - increment all the elements in the array with 3

        int[] q1 = {5, 6, 7, 8, 9, 10};
        int[] q2 = new int[]{10, 20, 30, 40, 50};

        int sum_q1=0;
        for (int i:q1) { sum_q1+=i; }
        System.out.println("sum_q1= " + sum_q1);

        System.out.println("q1 before:");
        for (int i:q1) { System.out.print(i + " "); }
        System.out.println("");

        for (int i=0; i<q1.length; i++) { q1[i]+=3; }
        System.out.println("q1 after:");
        for (int i:q1) { System.out.print(i + " "); }
    }


}
