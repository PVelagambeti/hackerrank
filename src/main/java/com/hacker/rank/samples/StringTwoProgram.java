package com.hacker.rank.samples;

import java.util.Scanner;

/**
 * Input Format
 *
 * The first line contains a single string denoting s.
 * The second line contains two space-separated integers denoting the respective values of start and end.
 *
 * Output Format
 *
 * Print the substring in the inclusive range from start to end-1.
 *
 * Sample Input:
 *
 * Helloworld
 * 3 7
 *
 * Sample Output:
 *
 * lowo
 */
public class StringTwoProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int start = scanner.nextInt();
        int end = scanner.nextInt();

        System.out.println(str.substring(start, end));
    }

}
