package com.hacker.rank.samples;

import java.text.NumberFormat;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class CommonCharactersInStrings {

    public static void main(String[] args) {

        String str1 = "hzlla";
        String str2 = "za";

        char[] c1 = str1.toCharArray();
        char[] c2 = str2.toCharArray();

        Set<Character> set1 = new HashSet<>();
        for (Character ch : c1) {
            set1.add(ch);
        }

        Set<Character> set2 = new HashSet<>();
        for (Character ch : c2) {
            set2.add(ch);
        }

        set1.retainAll(set2);

        if (set1.size() == 0)
            System.out.println("No common characters");
        else
            System.out.println(set1);

        System.out.println(NumberFormat.getInstance(Locale.FRANCE).format(1000000));
        System.out.println(NumberFormat.getCurrencyInstance(Locale.FRANCE).format(1000000));

    }

}
