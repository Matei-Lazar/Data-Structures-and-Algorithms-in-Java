package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = {20, 35, -15, 7, 55, 1, -22};

        //Arrays.sort(array);

        Arrays.parallelSort(array);
        // Look through the sort method's code for more details
        for (int item : array) {
            System.out.println(item);
        }
    }
}
