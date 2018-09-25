package com.hacker.rank.samples;

import java.io.BufferedReader;
import java.io.FileReader;

public class LineNumbersAndWords {

    public static void main(String[] args) {

        try {
            FileReader fr = new FileReader(System.getProperty("user.home") + "/Desktop/testfile.txt");
            BufferedReader br = new BufferedReader(fr);
            int lineNum = 0;
            int count = 0;

            String line = br.readLine();

            while (line != null) {
                lineNum++;
                String[] words = line.split(" ");
                for (String wc : words) {
                    count++;
                }
                line = br.readLine();
            }

            System.out.println("Number of lines :: " + lineNum);
            System.out.println("Number of words :: " + count);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
