package Lesson_4_OOP;

import Lesson_3_OOP.Comparators.AgeComparator;
import Lesson_3_OOP.Comparators.FirstNameComparator;
import Lesson_3_OOP.Comparators.SalaryComparator;
import Lesson_3_OOP.Employee;
import Lesson_3_OOP.Freelancer;
import Lesson_3_OOP.TestEmployee;
import Lesson_3_OOP.Worker;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 Домашняя работа, задача:
 ========================

 a. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
 b. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта,
 поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
 c. Для хранения фруктов внутри коробки можно использовать ArrayList;
 d. Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
 вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
 e. Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую
 подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае.
 Можно сравнивать коробки с яблоками и апельсинами;
 f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
 Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
 Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
 g. Не забываем про метод добавления фрукта в коробку.
 */
public class Main {

    public static void main(String[] args) {

        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        Apple apple4 = new Apple();
        Box<Apple> boxOfApples = new Box<>();
        boxOfApples.addFruit(apple1);
        boxOfApples.addFruit(apple2);
        boxOfApples.addFruit(apple3);
        boxOfApples.addFruit(apple4);

        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Orange orange3 = new Orange();
        Box<Orange> boxOfOranges = new Box<>();
        boxOfOranges.addFruit(orange1);
        boxOfOranges.addFruit(orange2);
        boxOfOranges.addFruit(orange3);

        System.out.println(boxOfApples.compare(boxOfOranges));
        Apple apple5 = new Apple();
        Apple apple6 = new Apple();
        boxOfApples.addFruit(apple5);
        boxOfApples.addFruit(apple6);

        Orange orange4 = new Orange();
        boxOfOranges.addFruit(orange4);
        System.out.println(boxOfApples.compare(boxOfOranges));

//        --------------

        Apple apple12 = new Apple();
        Apple apple22 = new Apple();
        Apple apple32 = new Apple();
        Apple apple42 = new Apple();
        Box<Apple> boxOfApples2 = new Box<>();
        boxOfApples2.addFruit(apple12);
        boxOfApples2.addFruit(apple22);
        boxOfApples2.addFruit(apple32);
        boxOfApples2.addFruit(apple42);

        System.out.println(boxOfApples.getFruitsCount());
        System.out.println(boxOfApples2.getFruitsCount());

        boxOfApples.combineTwoBoxes(boxOfApples2);

        System.out.println(boxOfApples.getFruitsCount());
        System.out.println(boxOfApples2.getFruitsCount());

//        --------------

//        boxOfApples.combineTwoBoxes(boxOfOranges);
//        boxOfApples.addFruit(orange1);
    }


}