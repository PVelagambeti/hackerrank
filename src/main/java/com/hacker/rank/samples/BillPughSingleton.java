package com.hacker.rank.samples;

public class BillPughSingleton {

    private BillPughSingleton() {

    }

    private static class BillPugh {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return BillPugh.INSTANCE;
    }

    public String sayHello() {
        System.out.println("Hello Praveen..!!");
        return "Hello Praveen";
    }

}
