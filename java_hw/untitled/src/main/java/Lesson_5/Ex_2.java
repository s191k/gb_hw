package Lesson_5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class Ex_2 {
    public static void main(String[] args) {
        try {
            List<String> names = Files.readAllLines(Paths.get("names.txt"));
            Set<String> uniqueNames = new HashSet<>(names);
            Map<String, Integer> resultMap = new HashMap<>();
            for (String uniqueName : uniqueNames) {
                resultMap.put(uniqueName, (int) names.stream().filter(x -> x.trim().equals(uniqueName.trim())).count());
            }

            Map<String, Integer> sortedMap = resultMap.entrySet()
                    .stream()
                    .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                    .collect(Collectors
                            .toMap(Map.Entry::getKey,
                                    Map.Entry::getValue,
                                    (e1, e2) -> e1,
                                    LinkedHashMap::new));
            System.out.println(sortedMap);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}