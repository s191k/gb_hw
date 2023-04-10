package Lesson_4;

import java.util.*;

//Реализуйте очередь с помощью LinkedList со следующими методами:
//• enqueue() — помещает элемент в конец очереди,
//• dequeue() — возвращает первый элемент из очереди и удаляет его,
//• first() — возвращает первый элемент из очереди, не удаляя.

public class Ex_2 {

    public static void main(String[] args) {
        MyArrayList<Integer> newLinkedList = new MyArrayList<>();
        newLinkedList.enqueue(1);
        newLinkedList.enqueue(2);
        newLinkedList.enqueue(3);
        newLinkedList.enqueue(4);
        newLinkedList.enqueue(5);
        System.out.println(newLinkedList);

        System.out.println(newLinkedList.dequeue());
        System.out.println(newLinkedList);

        System.out.println(newLinkedList.first());
        System.out.println(newLinkedList);
    }

}

class MyArrayList<T extends Integer> extends LinkedList<T> {
    public void enqueue(int num) { this.add((T) Integer.valueOf(num)); }
    public int dequeue() { return this.pollFirst(); }
    public int first() {return this.getFirst(); }
}