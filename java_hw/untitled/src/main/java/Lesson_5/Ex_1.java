package Lesson_5;

import java.util.*;

public class Ex_1 {

    public static void main(String[] args) {
        CellPhoneBook<String, List<String>> cellPhoneBook = new CellPhoneBook<>();

        cellPhoneBook.addNumber("Иван Иванов", "123456711");
        cellPhoneBook.addNumber("Иван Иванов", "123456712");
        cellPhoneBook.addNumber("Светлана Петрова", "223456712");
        cellPhoneBook.addNumber("Кристина Белова", "323456711");
        cellPhoneBook.addNumber("Кристина Белова", "323456712");
        cellPhoneBook.addNumber("Кристина Белова", "323456713");
        cellPhoneBook.addNumber("Кристина Белова", "323456714");

        cellPhoneBook.show();
    }

}

class CellPhoneBook<E, T> extends HashMap<E, T> {
    Map<E, List<T>> cellPhoneBookItem;

    public CellPhoneBook() {
        this.cellPhoneBookItem = new HashMap<>();
    }

    public void show() {
        System.out.println(this.cellPhoneBookItem);
    }

    public void addNumber(E fio, E number) {
        if (this.cellPhoneBookItem.containsKey(fio)) {
            this.cellPhoneBookItem.get(fio).add((T) number);
        } else {
            List<E> newList = new ArrayList<>();
            newList.add(number);
            this.cellPhoneBookItem.put(fio, (List<T>) newList);
        }
    }

}