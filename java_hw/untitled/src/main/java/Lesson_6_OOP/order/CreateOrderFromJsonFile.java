package Lesson_6_OOP.order;

import com.google.gson.Gson;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CreateOrderFromJsonFile implements CreateOrderHelper{

    private final String fileName;

    public CreateOrderFromJsonFile(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public Order createOrder() throws IOException {
        Gson gson = new Gson();
        return gson.fromJson(Files.readString(Paths.get(fileName + ".json")), Order.class);
    }

}