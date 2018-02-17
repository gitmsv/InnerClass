package ua.jvlab.smlnk;

import ua.jvlab.smlnk.usrObjects.A;

public class Main {

    public static void main(String[] args) {

        A a = new A();
        System.out.println(a.toString()); // output link;
        System.out.println();

        // use method jobs () inner class A1 - public, no stat:
        A.A1 a1 = a.new A1();
        a1.jobs();// Job one.

        System.out.println();

        // use method jobs () inner class 2 public, stat:
        A.A2 a3 = new A.A2();
        a3.jobs(); // Job two.

    }
}
