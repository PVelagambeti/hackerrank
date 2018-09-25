package com.hacker.rank.samples;

import java.rmi.MarshalledObject;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Sort the HashMap by Key
 */
public class HashMapKeyAndValueSort {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        map.put(11, "D");
        map.put(1, "G");
        map.put(16, "Q");
        map.put(10, "T");
        map.put(12, "X");
        map.put(9, "Z");

        // Printing the map before sorting
        System.out.println("Printing HashMap before sorting :: ");
        Set set = map.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            System.out.printf(entry.getKey() + ":");
            System.out.println(entry.getValue());
        }

        // Sort HashMap using TreeMap
        Map<Integer, String> sortedMap = new TreeMap<>(map);

        // Printing the HashMap after sorting
        System.out.println("Sorted HashMap by Key :: ");
        Set sortedSet = sortedMap.entrySet();
        Iterator sortedIterator = sortedSet.iterator();

        while (sortedIterator.hasNext()) {
            Map.Entry entry = (Map.Entry) sortedIterator.next();
            System.out.printf(entry.getKey() + ":");
            System.out.println(entry.getValue());
        }

        // Sorting HashMap by value
        System.out.println("Sorted Hash by value :: ");

        List list = new LinkedList(map.entrySet());

        Collections.sort(list, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return((Comparable) ((Map.Entry) (o1)).getValue()).compareTo(((Map.Entry)(o2)).getValue());
            }
        });

        Map sortedValueMap = new LinkedHashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            sortedValueMap.put(entry.getKey(), entry.getValue());
        }

        // Printing the HashMap
        Set sortedValueSet = sortedValueMap.entrySet();
        Iterator ite = sortedValueSet.iterator();
        while (ite.hasNext()) {
            Map.Entry entry = (Map.Entry) ite.next();
            System.out.printf(entry.getKey() + ":");
            System.out.println(entry.getValue());
        }

    }

}
