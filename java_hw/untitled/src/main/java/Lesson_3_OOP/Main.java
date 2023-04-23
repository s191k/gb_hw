package Lesson_3_OOP;

import Lesson_3_OOP.Comparators.AgeComparator;
import Lesson_3_OOP.Comparators.FirstNameComparator;
import Lesson_3_OOP.Comparators.SalaryComparator;

import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        List<Employee> employeeList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            employeeList.add(generateEmployee());
        }

        showEmpList(employeeList);
        employeeList.sort(new SalaryComparator());
        showEmpList(employeeList);
        employeeList.sort(new AgeComparator());
        showEmpList(employeeList);
        employeeList.sort(new FirstNameComparator());
        showEmpList(employeeList);
    }


    public static Employee generateEmployee() throws Exception {
        Random random = new Random();

        String[] names = new String[]{"Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман"};
        String[] surnames = new String[]{"Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов"};

        int salary = random.nextInt(1500);
        int salaryIndex = random.nextInt(31);

        switch (random.nextInt(3)) {
            case 0:
                return new Worker(names[random.nextInt(10)], surnames[random.nextInt(10)], salary * salaryIndex, random.nextInt(65));
            case 1:
                return new Freelancer(names[random.nextInt(10)], surnames[random.nextInt(10)], salary * salaryIndex, random.nextInt(65));
            case 2:
                return new TestEmployee(names[random.nextInt(10)], surnames[random.nextInt(10)], salary * salaryIndex, random.nextInt(65));
            default:
                throw new Exception("Error");
        }
    }

    public static void showEmpList(List<Employee> employeeList) {
        for (Employee curEmpl: employeeList) {
            System.out.println(curEmpl);
        }
        System.out.println("-----");
    }


}