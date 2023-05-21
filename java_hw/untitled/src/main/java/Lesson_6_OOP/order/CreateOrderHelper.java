package Lesson_6_OOP.order;

import com.google.gson.Gson;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class CreateOrderHelper {

    public Order inputFromConsole(){
        return new Order(prompt("Client name: "), prompt("Product: "),
                Integer.parseInt(prompt("Quantity: ")), Integer.parseInt(prompt("Quantity: ")));
    }

    public Order loadFromJsonFile(String fileName) throws IOException {
        Gson gson = new Gson();
        return gson.fromJson(Files.readString(Paths.get(fileName + ".json")), Order.class);
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

}