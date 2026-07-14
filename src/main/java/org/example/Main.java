package org.example;

// Import here manually
import org.packageone.ClassOne;
import org.packagetwo.ClassTwo;
import org.packagethree.ClassThree;

public class Main {
    public static void main(String[] args) {
        ClassOne c1 = new ClassOne();
        ClassTwo c2 = new ClassTwo();
        ClassThree c3 = new ClassThree();

        System.out.println(c1.greet());
        System.out.println(c2.greet());
        System.out.println(c3.greet());
    }
}