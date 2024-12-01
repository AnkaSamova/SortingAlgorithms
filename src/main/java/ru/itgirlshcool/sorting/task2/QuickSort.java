package ru.itgirlshcool.sorting.task2;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        String[] str = {"apple", "orange", "grape", "banana"};
        sort(str);
        System.out.println(Arrays.toString(str));
    }

    public static void sort(String[] str) {
        quickSort(str, 0, str.length - 1);
    }

    public static void quickSort(String[] str, int low, int high) {
        if (low < high) {
            int border = middle(str, low, high);
            quickSort(str, low, border - 1);
            quickSort(str, border + 1, high);
        }
    }

    public static int middle(String[] str, int low, int high) {
        String pivot = str[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (str[j].compareTo(pivot) < 0) {
                i++;
                String swap = str[i];
                str[i] = str[j];
                str[j] = swap;
            }
        }
        String swap = str[i + 1];
        str[i + 1] = str[high];
        str[high] = swap;
        return i + 1;
    }
}