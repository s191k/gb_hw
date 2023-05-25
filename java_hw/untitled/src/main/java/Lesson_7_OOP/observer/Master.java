package Lesson_7_OOP.lesson7.observer;


import Lesson_3_OOP.Worker;

public class Master implements Observer {

    private String name;
    private double salary;
    private WorkerType workerType;

    public Master(String name) {
        this.name = name;
        this.salary = 80000;
        this.workerType = WorkerType.MASTER;
    }

    @Override
    public void receiveOffer(Vacancy vacancy) {

        if (vacancy.workerType != this.workerType) {
            System.out.println("Это вакансия не подхрдит по специальности");
            return;
        }

        if (this.salary < salary){
            System.out.printf("Специалист %s >>> Мне нужна эта работа! [%s - %f]\n",
                    name, vacancy.nameCompany, vacancy.salary);
            this.salary = vacancy.salary;
        }
        else{
            System.out.printf("Специалист %s >>> Я найду работу получше! [%s - %f]\n",
                    name, vacancy.nameCompany, vacancy.salary);
        }
    }
}
