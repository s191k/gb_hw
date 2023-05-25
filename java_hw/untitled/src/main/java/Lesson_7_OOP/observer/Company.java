package Lesson_7_OOP.lesson7.observer;

import java.util.Random;

/**
 * Компания
 */
public class Company {

    private Random random;
    private String nameCompany;
    private double maxSalary;
    private Publisher jobAgency;


    public Company(String nameCompany, double maxSalary, Publisher jobAgency) {
        this.nameCompany = nameCompany;
        this.maxSalary = maxSalary;
        this.jobAgency = jobAgency;
        random = new Random();
    }

    public void needEmployee(){
        WorkerType workerType = WorkerType.getRandomWorkerType();
        double salary = random.nextDouble() * maxSalary;
        jobAgency.sendOffer(new Vacancy(nameCompany, salary, workerType));
    }


}
