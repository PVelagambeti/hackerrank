package com.hacker.rank.samples;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesFromArrayList {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("aa");
        list.add("ha");
        list.add("aa");
        list.add("aj");
        list.add("ya");

        System.out.println("Initial list :: " + list);

        // Convert array list to linked hashSet to avoid duplicates and to maintain the insertion order
        Set<String> set = new LinkedHashSet<>(list);

        // Remove all elements from list
        list.clear();

        // Copy back elements
        list.addAll(set);

        System.out.println("After removing duplicates from list :: " + list);


    }

}
