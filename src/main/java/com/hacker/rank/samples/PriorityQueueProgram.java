package com.hacker.rank.samples;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueProgram {

    public static void main(String[] args) {

        Queue<String> priorityQueue = new PriorityQueue<>(10, new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });

        priorityQueue.add("afsf fdsfsdf");
        priorityQueue.add("afsf");
        priorityQueue.add("afsf fds");
        priorityQueue.add("afsf ffds");
        priorityQueue.add("afsf ffdsd");

        System.out.println("Initial queue :: " + priorityQueue);

        priorityQueue.remove();

        System.out.println("Queue after removal :: " + priorityQueue);
    }

}
