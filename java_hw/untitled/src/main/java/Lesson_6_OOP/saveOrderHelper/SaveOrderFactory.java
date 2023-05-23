package Lesson_6_OOP.saveOrderHelper;


import Lesson_6_OOP.order.Order;

import java.util.List;

public class SaveOrderFactory {

    private List<SaveOrderHelper> saveOrderHelpers;
    private Order order;
    private String fileName;

    public SaveOrderFactory(List<SaveOrderHelper> saveOrderHelpers, Order order, String fileName) {
        this.saveOrderHelpers = saveOrderHelpers;
        this.order = order;
        this.fileName = fileName;
    }

    public void saveOrders() {
        for (SaveOrderHelper curOrder : this.saveOrderHelpers) {
            curOrder.saveOrderToFile(order,fileName);
        }
    }

}
