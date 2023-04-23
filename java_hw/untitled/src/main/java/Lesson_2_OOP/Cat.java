package Lesson_2_OOP;

public class Cat {
    private String name;
    private int appetite;
    private boolean isHungry;

    public Cat(String name, int appetite, boolean isHungry) {
        this.name = name;
        this.appetite = appetite;
        this.isHungry = isHungry;
    }

    public void eat(Plate plate) throws Exception {
        if(plate.getFood() < this.appetite) {
            System.out.println("Котику " + this.name + " не хватит еды");
            return;
        }

        if(this.isHungry) {
            plate.setFood(plate.getFood() - this.getAppetite());
            this.isHungry = false;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", appetite=" + appetite +
                ", isHungry=" + isHungry +
                '}';
    }
}