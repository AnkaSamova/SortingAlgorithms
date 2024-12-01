package ru.itgirlshcool.sorting.task1;

public class Student {
    private String surname;
    private double grade;

    public Student(String surname, double grade) {
        this.surname = surname;
        this.grade = grade;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public String toString() {
        return "[" + getSurname() + ", " + getGrade() + "]";
    }
}