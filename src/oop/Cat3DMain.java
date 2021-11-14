package oop;

public class Cat3DMain {
    public static void main(String[] args) {
        Cat3D c1 = new Cat3D("Mi", 3, true);
        System.out.println(c1.getName());
        System.out.println(c1.getAge());
        System.out.println(c1.getHappy());

        c1.setAge(4);
        c1.setName("Gi");
        c1.setHappy(false);

        System.out.println(c1.getName());
        System.out.println(c1.getAge());
        System.out.println(c1.getHappy());
    }
}
