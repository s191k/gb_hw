package Lesson_1_OOP;

public class Product {

    protected String name;
    protected String brand;
    protected double price;

    public double getPrice() { return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // accessor
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Product() {
        this("Продукт");
    }

    public Product(String name) {
        this(name, 1);
    }

    public Product(String name, double price) {
        this("Noname", name, price);
    }

    public Product(String brand, String name, double price) {
        this.brand = brand;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}
