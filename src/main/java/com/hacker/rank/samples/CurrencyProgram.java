package com.hacker.rank.samples;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * Input : 12324.134
 *
 * Expected output :
 *
 * US: $12,324.13
 * India: Rs.12,324.13
 * China: ￥12,324.13
 * France: 12 324,13 €
 *
 */
public class CurrencyProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        Locale inLocale = new Locale("en", "IN");

        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat in = NumberFormat.getCurrencyInstance(inLocale);
        NumberFormat cn = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat fr = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        System.out.println("US: "     + us.format(payment));
        System.out.println("India: "  + in.format(payment));
        System.out.println("China: "  + cn.format(payment));
        System.out.println("France: " + fr.format(payment));
    }

}
