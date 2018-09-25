package com.hacker.rank.samples;

public class SingletonQueueTest {

    public static void main(String[] args) {

        SingletonQueue singletonQueue = SingletonQueue.getInstance();

        singletonQueue.add("Praveen");
        singletonQueue.add("Kumar");
        singletonQueue.add("Velagam");
        singletonQueue.add("beti");

        System.out.println("Queue elements :: " + singletonQueue.get());

        singletonQueue.remove();
        System.out.println("After removing an element, Queue elements :: " + singletonQueue.get());

        System.out.println(singletonQueue.isEmpty());
        System.out.println(singletonQueue.getSize());

    }

}
