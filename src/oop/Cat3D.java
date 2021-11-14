package oop;
// access levels
public class Cat3D {
    private String name;
    private int age;
    private boolean happy;

    Cat3D(String name, int age, boolean happy) {
        this.name = name;
        this.age = age;
        this.happy = happy;
    }

    public String getName() { return this.name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return this.age; }
    public void setAge(int age) { this.age = age; }

    public boolean getHappy() { return this.happy; }
    public void setHappy(boolean happy) { this.happy = happy; }
}
