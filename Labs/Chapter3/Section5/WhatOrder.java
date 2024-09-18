package Labs.Chapter3.Section5;

import java.util.Scanner;

public class WhatOrder {

    public static <T extends Comparable<T>> int checkOrder(T a, T b, T c, T d) {
        if (a.compareTo(b) <= 0 && b.compareTo(c) <= 0 && c.compareTo(d) <= 0)
            return -1;
        else if (a.compareTo(b) >= 0 && b.compareTo(c) >= 0 && c.compareTo(d) >= 0)
            return 1;
        else
            return 0;

    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.println("Order: " + checkOrder(scnr.next(), scnr.next(), scnr.next(), scnr.next()));

        System.out.println(
                "Order: " + checkOrder(scnr.nextDouble(), scnr.nextDouble(), scnr.nextDouble(), scnr.nextDouble()));
    }
}