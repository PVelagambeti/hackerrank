package com.hacker.rank.samples;

import java.util.Scanner;

/**
 * You are given an integer n, you have to convert it into a string.
 *
 * Please complete the partially completed code in the editor. If your code successfully converts n into a string s the code
 * will print "Good job". Otherwise it will print "Wrong answer".
 *
 * n can range between -100 to 100 inclusive.
 */
public class IntToString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Convert integer to string
        String s = String.valueOf(n);

        if (n == Integer.parseInt(s))
            System.out.println("Good job");
        else
            System.out.println("Wrong answer");
    }
}
