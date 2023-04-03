package Lesson_1;

public class ex_1 {

    public static void main(String[] args) {
        System.out.println(getTriangleSum(2));
        System.out.println(getTriangleSum(3));
    }

    public static int getTriangleSum(int num) {
        return (num*(num + 1))/2;
    }

}
