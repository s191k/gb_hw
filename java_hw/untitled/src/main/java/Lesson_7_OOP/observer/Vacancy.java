package Lesson_7_OOP.lesson7.observer;

public class Vacancy {

    public String nameCompany;
    public double salary;
    public WorkerType workerType;

    public Vacancy(String nameCompany, double salary, WorkerType workerType) {
        this.nameCompany = nameCompany;
        this.salary = salary;
        this.workerType = workerType;
    }
}
