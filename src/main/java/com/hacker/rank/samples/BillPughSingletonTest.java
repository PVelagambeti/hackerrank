package com.hacker.rank.samples;

public class BillPughSingletonTest {

    public static void main(String[] args) {
        BillPughSingleton instance = BillPughSingleton.getInstance();
        System.out.println(instance.sayHello());
    }

}
