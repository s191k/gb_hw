package Lesson_1;

import java.util.Scanner;

public class ex_3 {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.next());
        int b = Integer.parseInt(scanner.next());
        System.out.println(simpleCalc("/",a,b));
    }

    public static int simpleCalc(String operation,int a, int b) throws Exception {

        switch (operation) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "/":
                return a / b;
            case "*":
                return a * b;
            default:
                throw new Exception("Указан неправильный вид операции");
        }
    }

}
