package Lesson_7_OOP.lesson7.observer;

public class Program {

    /**
     * TODO: 1.Доработать приложение, поработать с шаблоном проектирования Observer
     *   добавить новый тип соискателя.
     *   **.2 Добавить новую сущность "Вакансия", компания должна рассылать вакансии.
     *   **.3 Предусмотреть тип вакансии (enum)
     * @param args
     */
    public static void main(String[] args) {

        JobAgency jobAgency = new JobAgency();

        Company geekBrains = new Company("GeekBrains", 70000, jobAgency);
        Company google = new Company("Google", 100000, jobAgency);
        Company yandex = new Company("Yandex", 120000, jobAgency);

        Observer ivanov = new Master("Ivanov");
        Observer petrov = new Master("Petrov");
        Observer sidorov = new Student("Sidorov");
        Observer testerov = new QA("Testerov");

        jobAgency.registerObserver(ivanov);
        jobAgency.registerObserver(petrov);
        jobAgency.registerObserver(sidorov);
        jobAgency.registerObserver(testerov);

        for(int i = 0; i < 1; i++){
            System.out.println("start sending");
            geekBrains.needEmployee();
            System.out.println("---");
            google.needEmployee();
            System.out.println("---");
            yandex.needEmployee();
            System.out.println("end sending");
        }

    }

}
