package Lesson_1_OOP;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {

    private List<Product> products;

    public VendingMachine() {
        this.products = new ArrayList<>();
    }

    public VendingMachine(List<Product> products) {
        this.products = products;
    }

    public Product getProduct(String name) throws Exception {
        for (Product product : products) {
            if (product.name.equals(name)) {
                this.products.remove(product);
                return product;
            }
        }
        throw new Exception("Такого продукта нет/не осталось");
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    @Override
    public String toString() {
        return "VendingMachine{" +
                "products=" + products +
                '}';
    }
}
