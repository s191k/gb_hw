package Lesson_4_OOP;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit>{

    private List<T> fruits;

    public Box() {
        fruits = new ArrayList<>();
    }

    public int getFruitsCount() {
        return this.fruits.size();
    }

    public float getWeight() {
        return this.fruits.size() * this.fruits.get(0).getWeight();
    }

    public boolean compare(Box<? extends Fruit> otherBox) {
        return this.getWeight() == otherBox.getWeight();
    }

    public void combineTwoBoxes(Box<T> otherBox) {
        this.fruits.addAll(otherBox.fruits);
        otherBox.fruits = new ArrayList<>();
    }

    public void addFruit(T newFruit) {
        this.fruits.add(newFruit);
    }


}
