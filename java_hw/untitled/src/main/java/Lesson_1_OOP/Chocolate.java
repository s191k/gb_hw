package Lesson_1_OOP;

public class Chocolate extends Product {

    private String color;
    private double size;

    public Chocolate(String name, String brand, String color, double price, double size) {
        super(brand, name, price);
        this.color = color;
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Chocolate{" +
                "name='" + name + '\'' +
                "brand='" + brand + '\'' +
                "price='" + price + '\'' +
                "color='" + color + '\'' +
                ", size=" + size +
                '}';
    }
}
