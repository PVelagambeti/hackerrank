package com.hacker.rank.samples;

import java.util.ArrayList;
import java.util.List;

public class AddArrayLists {

    public static void main(String[] args) {

        List<String> lis1 = new ArrayList<>();
        lis1.add("q");
        lis1.add("t");
        lis1.add("y");
        lis1.add("u");

        List<String> list2 = new ArrayList<>();
        list2.add("h");
        list2.add("s");

        lis1.addAll(list2);

        System.out.println(lis1);
    }

}
