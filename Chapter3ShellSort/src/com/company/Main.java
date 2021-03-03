package com.company;

public class Main {

    public static void main(String[] args) {

        int[] array = {20, 35, -15, 7, 55, 1, -22};

        for (int gap = array.length / 2; gap >0; gap /= 2) {

            for (int i = gap; i < array.length; i++) {
                int newElement = array[i];

                int j = i;

                while (j >= gap && array[j-gap] > newElement) {
                    array[j] = array[j-gap];
                    j -= gap;
                }

                array[j] = newElement;
            }
        }

        for (int j : array) System.out.println(j);
    }

    public static void swap(int[] array, int i, int j) {
        if (i==j) {
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
