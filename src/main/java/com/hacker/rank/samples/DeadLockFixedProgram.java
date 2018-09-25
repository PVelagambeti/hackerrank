package com.hacker.rank.samples;

public class DeadLockFixedProgram {

    public void method1() {
        synchronized (String.class) {
            System.out.println("Acquired lock on string");

            synchronized (Integer.class) {
                System.out.println("Acquired lock on integer");
            }
        }
    }

    public void method2() {
        synchronized (String.class) {
            System.out.println("Acquired lock on string");

            synchronized (Integer.class) {
                System.out.println("Acquired lock on integer");
            }
        }
    }

}
