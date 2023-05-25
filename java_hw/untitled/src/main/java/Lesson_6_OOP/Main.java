package Lesson_6_OOP;

import Lesson_6_OOP.order.*;
import Lesson_6_OOP.saveOrderHelper.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

//        TODO выглядит какой-то оверкилл/что-то очень неправильное , т.к. хз как возвращать нужные объекты
//        CreateOrderFactory createOrderFactory = new CreateOrderFactory(
//                new ArrayList<>( List.of(new CreateOrderByConsole(), new CreateOrderFromJsonFile("exampleFromFile"))));

        CreateOrderHelper createOrderByConsole = new CreateOrderByConsole();
        CreateOrderHelper createOrderFromJsonFile = new CreateOrderFromJsonFile("exampleFromFile");
        Order orderFromConsole = createOrderByConsole.createOrder();
        Order orderFromJsonFile =createOrderFromJsonFile.createOrder();

        List<SaveOrderHelper> saveOrderHelperList = new ArrayList<>();
        saveOrderHelperList.add(new SaveOrderToJsonHelper());
        saveOrderHelperList.add(new SaveOrderToTxtHelper());
        saveOrderHelperList.add(new SaveOrderToXmlHelper());

        new SaveOrderFactory(saveOrderHelperList, orderFromConsole, "order").saveOrders();
        new SaveOrderFactory(saveOrderHelperList, orderFromJsonFile, "orderFromFile").saveOrders();

    }

}
