package Lesson_3_OOP;

public class TestEmployee extends Employee{

    public TestEmployee(String firstName, String surName, double salary, int age) {
        super(firstName, surName, salary,age);
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("TestEmployee: %s %s; Среднемесячная заработная плата: %.2f; Возраст: %d",
                surName, firstName, getSalary(), age);
    }
}

