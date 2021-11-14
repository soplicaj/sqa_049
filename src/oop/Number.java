package oop;

public class Number {
    public int x,y;

    public Number(int x, int y) {
        this.x=x;
        this.y=y;
    }

    public Number(double y) { this(0, (int) y); }
    public Number(String x) { this(Integer.parseInt(x),0); }
    public Number(){}

    public double operation(int a, int b) { return a+b; }
    public double operation(double a, double b) { return a*b; }
    void operation() { System.out.println("no parameters passed!"); }

}
