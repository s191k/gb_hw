package Lesson_2_OOP;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws Exception {

        Cat cat = new Cat("Barsik", 5, true);
        Plate plate = new Plate(100);
        plate.info();
        cat.eat(plate);
        plate.info();


        Random random = new Random();
        Cat cat1 = new Cat("Barsik1", random.nextInt(50), random.nextBoolean());
        Cat cat2 = new Cat("Barsik2", random.nextInt(50), random.nextBoolean());
        Cat cat3 = new Cat("Barsik3", random.nextInt(50), random.nextBoolean());
        Cat cat4 = new Cat("Barsik4", random.nextInt(50), random.nextBoolean());
        Cat cat5 = new Cat("Barsik5", random.nextInt(50), random.nextBoolean());
        List<Cat> catList = new ArrayList<>();
        catList.add(cat1);
        catList.add(cat2);
        catList.add(cat3);
        catList.add(cat4);
        catList.add(cat5);
        for (Cat curCat:catList ) { curCat.eat(plate); }
        for (Cat curCat:catList ) { System.out.println(curCat); }
        plate.info();


        plate.addFood(100);
        plate.info();
    }


}