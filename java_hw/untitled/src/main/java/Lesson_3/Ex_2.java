package Lesson_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Пусть дан произвольный список целых чисел, удалить из него чётные числа

public class Ex_2 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println(list);
        removeOdd(list);
        System.out.println(list);
    }

    public static void removeOdd(List<Integer> list) {
        for (int i = list.size() - 1; i > -1; i--) {
            if (i % 2 == 0) {
                list.remove(i + 1);
            }
        }
    }
}