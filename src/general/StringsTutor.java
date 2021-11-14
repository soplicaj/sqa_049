package general;

import javax.sound.midi.Soundbank;

public class StringsTutor {
    public static void main(String[] args) {
        String s1 = "Hello World";
        String s2 = "Hello World"; // reusing the same object
        System.out.println("Address of s1: " + System.identityHashCode(s1)); // same addresses
        System.out.println("Address of s2: " + System.identityHashCode(s2));

        String s3 = new String("Hello World");
        System.out.println("Address of s3: " + System.identityHashCode(s3));

        System.out.println(s1 == s2); // true, these are pointing to the same object
        System.out.println(s1.equals(s2)); // true, same content
        System.out.println(s1 == s3); // false, s3 was forcefully created as separate object
        System.out.println(s1.equals(s3)); // true, same content
    }
}
