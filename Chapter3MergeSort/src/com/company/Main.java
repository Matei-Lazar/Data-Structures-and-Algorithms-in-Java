package com.company;

public class Main {

    public static void main(String[] args) {
	    int[] array = {20, 35, -15, 7, 55, 1, -22};

	    //mergeSort(array, 0, array.length);
	    mergeSortDesc(array, 0, array.length);

	    for (int item : array) {
	        System.out.println(item);
        }
    }

    public static void mergeSort(int[] input, int start, int end) {
        if (end-start <2) {
            return;
        }

        int mid = (start+end) / 2;
        mergeSort(input, start, mid);
        mergeSort(input, mid, end);
        merge(input, start, mid, end);
    }

    public static void merge(int[] input, int start, int mid, int end) {
        if (input[mid-1] <= input[mid]) {
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end-start];
        while (i < mid && j < end) {
            temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
        }

        System.arraycopy(input, i, input, start+tempIndex, mid-i);
        System.arraycopy(temp, 0, input, start, tempIndex);
    }

    public static void mergeSortDesc(int[] input, int start, int end) {
        if (end-start <2) {
            return;
        }

        int mid = (start+end) / 2;
        mergeSortDesc(input, start, mid);
        mergeSortDesc(input, mid, end);
        mergeDesc(input, start, mid, end);
    }

    public static void mergeDesc(int[] input, int start, int mid, int end) {

        if (input[mid - 1] >= input[mid]) {
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end - start];
        while (i < mid && j < end) {
            temp[tempIndex++] = input[i] >= input[j] ? input[i++] : input[j++];
        }

        System.arraycopy(input, i, input, start+tempIndex, mid-i);
        System.arraycopy(temp, 0, input, start, tempIndex);
    }
}
