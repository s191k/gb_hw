package Lesson_7_OOP.lesson7.observer;

public class Student implements Observer {

    private String name;
    private double salary;
    private WorkerType workerType;

    public Student(String name) {
        this.name = name;
        this.salary = 5000;
        this.workerType = WorkerType.STUDENT;
    }

    @Override
    public void receiveOffer(Vacancy vacancy) {
        if (vacancy.workerType != this.workerType) {
            System.out.println("Это вакансия не подхрдит по специальности");
            return;
        }

        if (this.salary < vacancy.salary){
            System.out.printf("Студент %s >>> Мне нужна эта работа! [%s - %f]\n",
                    name, vacancy.nameCompany, vacancy.salary);
            this.salary = vacancy.salary;
        }
        else{
            System.out.printf("Студент %s >>> Я найду работу получше! [%s - %f]\n",
                    name, vacancy.nameCompany, vacancy.salary);
        }
    }
}
