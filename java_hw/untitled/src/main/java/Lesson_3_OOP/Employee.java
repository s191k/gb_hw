package Lesson_3_OOP;

public abstract class Employee implements Comparable<Employee>{

    protected String firstName;
    protected String surName;
    protected double salary;
    protected int age;

    public Employee(String firstName, String surName, double salary, int age) {
        this.firstName = firstName;
        this.surName = surName;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() { return age; }
    public String getFirstName() { return firstName; }

    public abstract double getSalary();

    @Override
    public String toString() {
        return String.format("Сотрудник: %s %s; Вид сотрудника: %s; Среднемесячная заработная плата: %.2f; Возраст: %d",
                surName, firstName, this.getClass().getName() ,salary, age);
    }

    @Override
    public int compareTo(Employee o) {
        return Double.compare(getSalary(), o.getSalary());
    }
}