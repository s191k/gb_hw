package Lesson_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое этого списка.
//        *Реализовать разность массивов и симметрическую разность.

public class Ex_3 {

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(5, 6, 7, 8, 9, 10, 11, 12, 13, 14));
        System.out.println(getListSum(list1));
        System.out.println(getListMin(list1));
        System.out.println(getListMax(list1));
        System.out.println(getListsDiff(list1,list2));
        System.out.println(getListsSymmetricalDiff(list1,list2));

    }

    public static int getListSum(List<Integer> list) {
        int result = 0;
        for (int cur:list) {result += cur;}
        return result;
    }

    public static int getListMin(List<Integer> list) {
        int min = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            int curNum = list.get(i);
            if ( curNum < min ) { min = curNum; }
        }
        return min;
    }

    public static int getListMax(List<Integer> list) {
        int max = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            int curNum = list.get(i);
            if ( curNum > max) { max = curNum; }
        }
        return max;
    }

    public static List<Integer> getListsDiff(List<Integer> list1, List<Integer> list2) {
        List<Integer> listInner1 = new ArrayList<>(list1);
        List<Integer> listInner2 = new ArrayList<>(list2);
        listInner1.removeAll(listInner2);
        return listInner1;
    }

    public static List<Integer> getListsSymmetricalDiff(List<Integer> list1, List<Integer> list2) {
        List<Integer> listInner1 = new ArrayList<>(list1);
        List<Integer> listInner2 = new ArrayList<>(list2);
        List<Integer> listTemp = new ArrayList<>(list1);
        listInner1.removeAll(listInner2);
        listInner2.removeAll(listTemp);
        listInner1.addAll(listInner2);
        return listInner1;
    }


}