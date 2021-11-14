package primitives;

public class PrimitiveTutor {
    public static void main(String[] args) {
        byte b1;
        b1 = 10;
        byte b2, b3, b4;
        b3 = 20;

        short s1 = 25;
        short s2, s3 = 35, s4;
        s4 = 40;

        int i1 = 10;
        int i2 = 040; // octal base
        System.out.println("i2="+i2);
        int i3 = 0xAF; // base 16
        System.out.println("i3="+i3);
        int i4 = 0b1100010111;
        System.out.println("i4="+i4);
        int i5 = 6_543_123;
        System.out.println("i5="+i5);

        long d1 = 1234567899012345678L;

        float f1 = 12345F;
        float f2 = (float) 12345;

        System.out.println((char)165);

        boolean r1 = true;
    }
}
