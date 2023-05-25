package Lesson_7_OOP.lesson7.observer;

public class QA implements Observer {

    private String name;
    private double salary;
    private WorkerType workerType;

    public QA(String name) {
        this.name = name;
        this.salary = 75000;
        this.workerType = WorkerType.QA;
    }

    @Override
    public void receiveOffer(Vacancy vacancy) {
        if (vacancy.workerType != this.workerType) {
            System.out.println("Это вакансия не подхрдит по специальности");
            return;
        }

        if (this.salary < salary){
            System.out.printf("Тестировщик %s >>> Мне нужна эта работа! [%s - %f]\n",
                    name, vacancy.nameCompany, vacancy.salary);
            this.salary = vacancy.salary;
        }
        else{
            System.out.printf("Тестировщик %s >>> Я найду работу получше! [%s - %f]\n",
                    name, vacancy.nameCompany, vacancy.salary);
        }
    }
}
