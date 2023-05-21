package Lesson_6_OOP.saveOrderHelper;

import Lesson_6_OOP.order.Order;

import java.io.FileWriter;
import java.io.IOException;

public class SaveOrderToXmlHelper implements SaveOrderHelper {

    @Override
    public void saveOrderToFile(Order order, String fileName) {
        try (FileWriter writer = new FileWriter(fileName + ".xml", false)) {
            writer.write("<Order>" + "\n");
            writer.write("\t<clientName>"+ order.getClientName() + "</clientName>\n");
            writer.write("\t<product>"+order.getProduct()+"</product>\n");
            writer.write("\t<qnt>"+order.getQnt()+"</qnt>\n");
            writer.write("\t<price>"+order.getPrice()+"</price>\n");
            writer.write("</Order>" + "\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }

}
