package Lesson_3_OOP;

public class Worker extends Employee{

    public Worker(String firstName, String surName, double salary, int age) {
        super(firstName, surName, salary, age);
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("Рабочий: %s %s; Среднемесячная заработная плата: %.2f; Возраст: %d",
                surName, firstName, getSalary(), age);
    }
}
