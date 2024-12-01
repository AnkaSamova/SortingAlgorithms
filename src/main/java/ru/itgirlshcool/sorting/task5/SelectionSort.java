package ru.itgirlshcool.sorting.task5;

import java.util.Arrays;
import java.util.List;

public class SelectionSort {
    public static void main(String[] args) {
        List<String> formulas = Arrays.asList("5+6+32=43", "1+1=2", "(3+5)*4*21=483", "((21-20)*(32-30))/2=1");
        for (int i = 0; i < formulas.size(); i++) {
            int pos = i;
            String min = formulas.get(i);
            for (int j = i + 1; j < formulas.size(); j++) {
                if (operations(formulas.get(j)) < operations(min)) {
                    pos = j;
                    min = formulas.get(j);
                }
            }
            formulas.set(pos, formulas.get(i));
            formulas.set(i, min);
        }
        System.out.println(formulas);
    }

    public static int operations(String formula) {
        int count = 0;
        char[] form = {'+', '-', '*', '/'};
        for (char c : formula.toCharArray()) {
            for (char f : form) {
                if (c == f) {
                    count++;
                }
            }
        }
        return count;
    }
}