package ru.itgirlshcool.sorting.task3;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        String[] str = {"cat", "orange", "elephant", "bird"};
        sort(str);
        System.out.println(Arrays.toString(str));
    }

    public static void sort(String[] str) {
        if (str == null || str.length <= 1) return;
        String[] buffer = new String[str.length];
        mergeSort(str, buffer, 0, str.length - 1);
    }

    public static void mergeSort(String[] str, String[] buffer, int startIndex, int endIndex) {
        if (startIndex < endIndex) {
            int middle = startIndex + (endIndex - startIndex) / 2;
            mergeSort(str, buffer, startIndex, middle);
            mergeSort(str, buffer, middle + 1, endIndex);
            merge(str, buffer, startIndex, middle, endIndex);
        }
    }

    public static void merge(String[] str, String[] buffer, int startIndex, int middle, int endIndex) {
        int index1 = startIndex;
        int index2 = middle + 1;
        int destIndex = startIndex;
        while (index1 <= middle && index2 <= endIndex) {
            if (str[index1].length() <= str[index2].length()) {
                buffer[destIndex] = str[index1];
                index1++;
            } else {
                buffer[destIndex] = str[index2];
                index2++;
            }
            destIndex++;
        }
        while (index1 <= middle) {
            buffer[destIndex] = str[index1];
            destIndex++;
            index1++;
        }
        while (index2 <= endIndex) {
            buffer[destIndex] = str[index2];
            destIndex++;
            index2++;
        }
        System.arraycopy(buffer, startIndex, str, startIndex, endIndex - startIndex + 1);
    }
}