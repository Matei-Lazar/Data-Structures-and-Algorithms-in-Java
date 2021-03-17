package com.company;

public class Main {

    public static void main(String[] args) {

        int[] array = {20, 35, -15, 7, 55, 1, -22};

        //insertionSort(array);
        insertionSortRecursive(array, array.length);

        for (int j : array) System.out.println(j);
    }

    public static void insertionSort(int[] array) {
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < array.length; firstUnsortedIndex++) {

            int newElement = array[firstUnsortedIndex];

            int i;

            for (i = firstUnsortedIndex; i > 0 && array[i-1] > newElement; i--) {
                array[i] = array[i-1];
            }
            array[i] = newElement;
        }
    }

    public static void insertionSortRecursive(int[] array, int numItems) {
        if (numItems < 2) {
            return;
        }

        insertionSortRecursive(array, numItems-1);

        int newElement = array[numItems - 1];

        int i;

        for (i = numItems - 1; i > 0 && array[i-1] > newElement; i--) {
            array[i] = array[i-1];
        }
        array[i] = newElement;
    }
}
