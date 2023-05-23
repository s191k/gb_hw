package Lesson_6_OOP.order;

import java.io.IOException;
import java.util.List;

public class CreateOrderFactory {

    private final List<CreateOrderHelper> createOrderHelperList;

    public CreateOrderFactory(List<CreateOrderHelper> createOrderHelperList) {
        this.createOrderHelperList = createOrderHelperList;
    }

    public void createOrders() throws IOException {
         for (CreateOrderHelper curOrderHelper : createOrderHelperList) {
            curOrderHelper.createOrder();
        }
    }

}
