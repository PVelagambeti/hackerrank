package com.hacker.rank.samples;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Create a singleton Queue global object - FIFO
 */
public class SingletonQueue {

    static Queue<String> queue = new LinkedList<>();

    private static SingletonQueue instance = null;

    private SingletonQueue() {

    }

    public static SingletonQueue getInstance() {
        if (instance == null) {
            instance = new SingletonQueue();
        }
        return instance;
    }

    public Queue<String> get() {
        return queue;
    }

    public void add(String value) {
        synchronized (queue) {
            queue.add(value);
        }
    }

    public void remove() {
        synchronized (queue) {
            queue.remove();
        }
    }

    public int getSize() {
        return queue.size();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

}
