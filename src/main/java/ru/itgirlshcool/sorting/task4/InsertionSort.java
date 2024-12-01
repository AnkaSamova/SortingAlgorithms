package ru.itgirlshcool.sorting.task4;

import java.util.Arrays;
import java.util.List;

public class InsertionSort {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("cat", "orange", "elephant", "bird");
        int j;
        for (int i = 1; i < words.size(); i++) {
            String swap = words.get(i);
            for (j = i - 1; j > 0 && vowels(swap) < vowels(words.get(j)); j--) {
                words.set(j + 1, words.get(j));
            }
            words.set(j + 1, swap);
        }
        System.out.println(words);
    }

    public static int vowels(String word) {
        int count = 0;
        char[] vow = {'a', 'e', 'i', 'o', 'u'};
        for (char c : word.toCharArray()) {
            for (char v : vow) {
                if (c == v) {
                    count++;
                }
            }
        }
        return count;
    }
}