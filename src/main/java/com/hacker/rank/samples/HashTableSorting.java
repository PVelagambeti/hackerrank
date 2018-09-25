package com.hacker.rank.samples;

import java.util.Collections;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;

/**
 * Hash table doesn't guarantee the order.
 * We can't sort the Hash table, but we can sort hash table elements separately and
 * hash table keys separately.
 */
public class HashTableSorting {

    public static void main(String[] args) {
        Hashtable<String, String> ht = new Hashtable<>();
        ht.put("z", "aa");
        ht.put("a", "ra");
        ht.put("f", "ga");
        ht.put("q", "ag");

        System.out.println("Sorting hash table values : ");
        List list = Collections.list(ht.elements());
        Collections.sort(list);

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("Sorting hash table keys : ");
        List two = Collections.list(ht.keys());
        Collections.sort(two);

        Iterator itera = two.iterator();
        while (itera.hasNext()) {
            System.out.println(itera.next());
        }
    }

}
