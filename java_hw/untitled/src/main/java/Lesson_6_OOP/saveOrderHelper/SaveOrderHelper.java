package Lesson_6_OOP.saveOrderHelper;

import Lesson_6_OOP.order.Order;

public interface SaveOrderHelper {

    void saveOrderToFile(Order order, String fileName);

}
