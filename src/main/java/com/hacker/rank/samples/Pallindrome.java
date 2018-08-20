package com.hacker.rank.samples;

import java.util.Scanner;

/**
 * Given a string A, print Yes if it is a palindrome, print No otherwise.
 *
 * Sample Input
 *
 * madam
 *
 * Sample Output
 *
 * Yes
 */
public class Pallindrome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();

        StringBuffer buffer = new StringBuffer(s);
        String rev = buffer.reverse().toString();

        System.out.println(s.equalsIgnoreCase(rev) ? "Yes" : "No");
    }

}
