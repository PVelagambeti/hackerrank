package com.hacker.rank.samples;

/**
 * Return the sum of the array elements
 */
public class SimpleArraySum {

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6, 7, 9};
        int result = 0;

        for (int i = 0; i < arr.length; i++){
            result += arr[i];
        }

        System.out.println(result);
    }

}
