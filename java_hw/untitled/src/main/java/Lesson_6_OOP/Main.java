package Lesson_6_OOP;

import Lesson_6_OOP.order.*;
import Lesson_6_OOP.saveOrderHelper.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        System.out.println("Введите заказ:");
        CreateOrderHelper createOrderHelper = new CreateOrderHelper();
        Order order = createOrderHelper.inputFromConsole();
        Order order2 = createOrderHelper.loadFromJsonFile("exampleFromFile");

        List<SaveOrderHelper> saveOrderHelperList = new ArrayList<>();
        saveOrderHelperList.add(new SaveOrderToJsonHelper());
        saveOrderHelperList.add(new SaveOrderToTxtHelper());
        saveOrderHelperList.add(new SaveOrderToXmlHelper());
        for (SaveOrderHelper curSaverOrderHelper: saveOrderHelperList) {
            curSaverOrderHelper.saveOrderToFile(order, "order");
            curSaverOrderHelper.saveOrderToFile(order2, "orderFromFile");
        }

    }

}