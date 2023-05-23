package Lesson_6_OOP.order;

import java.util.Scanner;

public class CreateOrderByConsole implements CreateOrderHelper{

    @Override
    public Order createOrder() {
        System.out.println("Введите заказ:");
        return new Order(prompt("Client name: "), prompt("Product: "),
                Integer.parseInt(prompt("Quantity: ")), Integer.parseInt(prompt("Quantity: ")));
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

}