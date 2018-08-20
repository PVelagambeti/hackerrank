package com.hacker.rank.samples;

import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Sample Input 0
 *
 * welcometojava
 * 3
 *
 * Sample Output 0
 *
 * ava
 * wel
 *
 * Explanation 0
 *
 * String "welcometojava" has the following lexicographically-ordered substrings of length k=3:
 *
 * ["ava", "com", "elc", "eto", "jav", "lco", "met", "oja", "ome", "toj", "wel"]
 *
 * We then return the first (lexicographically smallest) substring and the last (lexicographically largest) substring as
 * two newline-separated values (i.e., ava \n wel).
 *
 * The stub code in the editor then prints "ava" as our first line of output and "wel" as our second line of output.
 */
public class SubstringComparisons {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println("1st approach :: \n" + getSmallestAndLargest(s, k));
        System.out.println("2nd approach :: \n" + getSmallestAndLargestTwo(s, k));
    }

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        SortedSet<String> set = new TreeSet<>();
        for(int i =0; i <= s.length()-k; i++){
            set.add(s.substring(i, i+k));
        }

        smallest = set.first();
        largest = set.last();

        return smallest + "\n" + largest;
    }

    public static String getSmallestAndLargestTwo(String s, int k) {
        String largest = s.substring(0, k);
        String smallest = s.substring(0, k);
        for (int i = 0; i <= s.length() - k; i++){
            String curr = s.substring(i, i + k);
            if (curr.compareTo(smallest) < 0)
                smallest = curr;
            if (curr.compareTo(largest) > 0)
                largest = curr;
        }

        return smallest + "\n" + largest;
    }

}
