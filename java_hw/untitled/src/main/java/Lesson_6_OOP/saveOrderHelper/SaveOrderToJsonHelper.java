package Lesson_6_OOP.saveOrderHelper;

import Lesson_6_OOP.order.Order;

import java.io.FileWriter;
import java.io.IOException;

public class SaveOrderToJsonHelper implements SaveOrderHelper {

    @Override
    public void saveOrderToFile(Order order, String fileName) {
        try (FileWriter writer = new FileWriter(fileName + ".json", false)) {
            writer.write("{\n");
            writer.write("\"clientName\":\""+ order.getClientName() + "\",\n");
            writer.write("\"product\":\""+order.getProduct()+"\",\n");
            writer.write("\"qnt\":"+order.getQnt()+",\n");
            writer.write("\"price\":"+order.getPrice()+"\n");
            writer.write("}\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }

}
