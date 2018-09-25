package com.hacker.rank.samples;

public class DeadLockProgram {

    public void method1() {
        synchronized (String.class) {
            System.out.println("Acquired lock on string");

            synchronized (Integer.class) {
                System.out.println("Acquired lock on integer");
            }
        }
    }

    public void method2() {
        synchronized (Integer.class) {
            System.out.println("Acquired lock on Integer");

            synchronized (String.class) {
                System.out.println("Acquired lock on String");
            }
        }
    }
}
