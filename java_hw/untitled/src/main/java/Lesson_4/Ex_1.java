package Lesson_4;

import java.util.Arrays;
import java.util.LinkedList;

public class Ex_1 {

    public static void main(String[] args) {
        System.out.println(reverseLinkedList(new LinkedList<>(Arrays.asList(1,2,3,4,5))));
    }

    public static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> linkedList){
        LinkedList<Integer> reversedLinkedList = new LinkedList<>();
        while (linkedList.size() != 0) {
            reversedLinkedList.add(linkedList.pollLast());
        }
        return reversedLinkedList;
    }
}