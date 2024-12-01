package ru.itgirlshcool.sorting.task1;

import java.util.ArrayList;
import java.util.List;

public class BubbleSort {
    public static void main(String[] args) {
        Student st1 = new Student("Иванов", 4.5);
        Student st2 = new Student("Петров", 3.7);
        Student st3 = new Student("Сидоров", 4.2);
        Student st4 = new Student("Козлов", 5.0);
        Student st5 = new Student("Смирнов", 3.9);
        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);
        bubbleSort(students);
        for (Student st : students) {
            System.out.println(st);
        }
    }

    public static void bubbleSort(List<Student> students) {
        for (int i = 0; i < students.size(); i++) {
            for (int j = 0; j < students.size() - i - 1; j++) {
                if (students.get(j).getGrade() < students.get(j + 1).getGrade()) {
                    Student swap = students.get(j);
                    students.set(j, students.get(j + 1));
                    students.set(j + 1, swap);
                }
            }
        }
    }
}