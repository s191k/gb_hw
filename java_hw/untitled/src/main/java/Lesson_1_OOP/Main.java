package Lesson_1_OOP;

public class Main {
    public static void main(String[] args) throws Exception {

        Product bounty = new Chocolate("баунти", "bounty", "white", 100, 10);
        Product milkyway = new Chocolate("милкивей", "milkyway", "white", 200, 20);
        Product sneakers = new Chocolate("сникерс", "sneakers", "brown", 300, 30);
        Product mars = new Chocolate("марс", "mars", "brown",  400, 40);

        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.addProduct(bounty);
        vendingMachine.addProduct(milkyway);
        vendingMachine.addProduct(sneakers);
        vendingMachine.addProduct(mars);

        System.out.println(vendingMachine);
        System.out.println(vendingMachine.getProduct("баунти"));
        System.out.println(vendingMachine.getProduct("марс"));
        System.out.println(vendingMachine);

    }
}