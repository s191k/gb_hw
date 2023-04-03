package Lesson_2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ex_1 {

    public static void main(String[] args) throws IOException {
        System.out.println(Arrays.toString(sort(new int[]{2, 9, 3, 1, 0, 5, 6, 8, 1, 2, 0, 5})));
    }

    public static int[] sort(int[] intarray) throws IOException {

        List<String> logs = new ArrayList<>();

        for (int i = 0; i < intarray.length; i++) {
            for (int y = 0; y < intarray.length; y++) {
                if (intarray[i] < intarray[y]) {
                    int temp = intarray[i];
                    intarray[i] = intarray[y];
                    intarray[y] = temp;
                    logs.add(Arrays.toString(intarray));
                }
            }
        }


        Files.write(Paths.get( "logs.txt"), logs);
        return intarray;
    }

}