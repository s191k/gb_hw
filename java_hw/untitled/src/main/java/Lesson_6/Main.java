package Lesson_6;

import java.util.*;

//Подумать над структурой класса Ноутбук для магазина техники — выделить поля и методы. Реализовать в Java.
//        Создать множество ноутбуков.
//        Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
//        “Введите цифру, соответствующую необходимому критерию:
//        1 - ОЗУ
//        2 - Объём ЖД
//        3 - Операционная система
//        4 - Цвет …
//        Далее нужно запросить минимальные значения для указанных критериев — сохранить параметры фильтрации можно также в Map.
//        Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.


public class Main {
    public static void main(String[] args) {

        Laptop laptopXiaomi = new Laptop("Intel Core i3", 2,"1920x1080", 15.6, 256, 8, true);
        Laptop laptopAsus= new Laptop("AMD Ryzen 5", 6,"1920x1080", 15.6, 512, 8, true);
        Laptop laptopThunderobot = new Laptop("Intel Core i5", 8,"2560х1440", 15.6, 512, 16, false);

        List<Laptop> laptops = new ArrayList<>();
        laptops.add(laptopXiaomi);
        laptops.add(laptopAsus);
        laptops.add(laptopThunderobot);

//  TODO Для создания фильтра, закоммитил чтобы не прописывать каждый раз
//   System.out.println(makeFilter());

        Map<String, String> testFilter1 = new HashMap<>(){{
            put("cpu", "AMD Ryzen 5");
            put("resolution", "2560х1440");
            put("ssdVolume", "512");
        }};

        System.out.println(applyFilter(testFilter1, laptops));

        Map<String, String> testFilter2 = new HashMap<>(){{
            put("cpu", "AMD Ryzen 5");
            put("resolution", "1920x1080");
            put("ssdVolume", "512");
        }};

        System.out.println(applyFilter(testFilter2, laptops));

    }

    public static Map<String, String> makeFilter() throws Exception {
        Map<String, String> filter = new HashMap<>();
        boolean stillFiltering = true;
        System.out.println("Фильтрация ноутбуков");

        while (stillFiltering) {
            System.out.println("Введите цифру, соответствующую необходимому критерию");
            System.out.println("1 - Процессор");
            System.out.println("2 - Количество ядер");
            System.out.println("3 - Разрешение экрана");
            System.out.println("4 - Диагональ экрана");
            System.out.println("5 - Объем SSD");
            System.out.println("6 - Оперативная память (RAM)");
            System.out.println("7 - Наличие вебкамеры");
            System.out.println("8 - Возвратить собранный фильтр");
            System.out.println("9 - выход без фильтра");
            System.out.println("----");
            System.out.println("Если хотите перевыбрать указанный фильтр, ");
            System.out.println("просто заново выберите нужный фильтр");


            int inputInt = new Scanner(System.in).nextInt();
            switch (inputInt) {

                case 1:
                    System.out.println("Доступные процессоры ::");
                    showInConsoleEntityList(getAvailableCpu());
                    System.out.println("Введите номер нужного варианта ::");
                    filter.put("cpu", getAvailableCpu().get(new Scanner(System.in).nextInt() - 1));
                    break;
                case 2:
                    System.out.println("Доступное количество ядер ::");
                    showInConsoleEntityList(getAvailableNumberOfCores());
                    System.out.println("Введите номер нужного варианта ::");
                    filter.put("numberOfCores", String.valueOf(getAvailableNumberOfCores().get(new Scanner(System.in).nextInt() - 1)));
                    break;
                case 3:
                    System.out.println("Доступные разрешения экрана ::");
                    showInConsoleEntityList(getAvailableResolution());
                    System.out.println("Введите номер нужного варианта ::");
                    filter.put("resolution", getAvailableResolution().get(new Scanner(System.in).nextInt() - 1));
                    break;
                case 4:
                    System.out.println("Доступные диагонали экрана ::");
                    showInConsoleEntityList(getAvailableScreenDiagonalSize());
                    System.out.println("Введите номер нужного варианта ::");
                    filter.put("screenDiagonalSize", String.valueOf(getAvailableScreenDiagonalSize().get(new Scanner(System.in).nextInt() - 1)));
                    break;
                case 5:
                    System.out.println("Доступные объемы SSD ::");
                    showInConsoleEntityList(getAvailableSSDSize());
                    System.out.println("Введите номер нужного варианта ::");
                    filter.put("ssdVolume", String.valueOf(getAvailableSSDSize().get(new Scanner(System.in).nextInt() - 1)));
                    break;
                case 6:
                    System.out.println("Доступные объемы оперативной памяти ::");
                    showInConsoleEntityList(getAvailableRAMSize());
                    System.out.println("Введите номер нужного варианта ::");
                    filter.put("ram", String.valueOf(getAvailableRAMSize().get(new Scanner(System.in).nextInt() - 1)));
                    break;
                case 7:
                    System.out.println("Наличие вебкамеры :: 1 - да , 2 - нет");
                    System.out.println("Введите номер нужного варианта ::");
                    filter.put("hasWebCam", String.valueOf(new Scanner(System.in).nextInt() - 1));
                    break;
                case 8:
                    stillFiltering = false;
                    break;
                case 9:
                    return null;
                default:
                    throw new IllegalArgumentException("Введена значение не из цифры с 1 по 9");

            }
        }

        if (filter.size() == 0) {
            throw new Exception("Введена значение не из цифры с 1 по 9");
        } else {
            return filter;
        }
    }

    public static void showInConsoleEntityList(List list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println((i + 1) + " - " + list.get(i));
        }
    }

    public static List<String> getAvailableCpu(){
        return new ArrayList<>(Arrays.asList("Intel Core i3","Intel Core i5", "AMD Ryzen 5"));
    }

    public static List<Integer> getAvailableNumberOfCores(){
        return new ArrayList<>(Arrays.asList(2,6,8));
    }

    public static List<String> getAvailableResolution(){
        return new ArrayList<>(Arrays.asList("1920x1080","2560х1440"));
    }

    public static List<Double> getAvailableScreenDiagonalSize(){
        return new ArrayList<>(Arrays.asList(15.6));
    }

    public static List<Integer> getAvailableSSDSize(){
        return new ArrayList<>(Arrays.asList(256, 512));
    }

    public static List<Integer> getAvailableRAMSize(){
        return new ArrayList<>(Arrays.asList(8, 16));
    }

    public static List<Laptop> applyFilter(Map<String, String> laptopFilter, List<Laptop> laptops) {
        List<Laptop> filteredLaptops = new ArrayList<>();

        for (Laptop curLaptop: laptops) {
            boolean filteredCpu = !laptopFilter.containsKey("cpu") || curLaptop.getCpu().equals(laptopFilter.get("cpu"));
            boolean filteredNumberOfCores = !laptopFilter.containsKey("numberOfCores") || String.valueOf(curLaptop.getNumberOfCores()).equals(laptopFilter.get("numberOfCores"));
            boolean filteredResolution = !laptopFilter.containsKey("resolution") || curLaptop.getResolution().equals(laptopFilter.get("resolution"));
            boolean filteredScreenDiagonalSize = !laptopFilter.containsKey("screenDiagonalSize") || String.valueOf(curLaptop.getScreenDiagonalSize()).equals(laptopFilter.get("screenDiagonalSize"));
            boolean filteredSsdVolume = !laptopFilter.containsKey("ssdVolume") || String.valueOf(curLaptop.getSsdVolume()).equals(laptopFilter.get("ssdVolume"));
            boolean filteredRam = !laptopFilter.containsKey("ram") || String.valueOf(curLaptop.getRam()).equals(laptopFilter.get("ram"));
            boolean filteredHasWebCam = !laptopFilter.containsKey("hasWebCam") || String.valueOf(curLaptop.isHasWebCam()).equals(laptopFilter.get("hasWebCam"));

            if (filteredCpu && filteredNumberOfCores && filteredResolution && filteredScreenDiagonalSize && filteredSsdVolume
                    && filteredRam && filteredHasWebCam) { filteredLaptops.add(curLaptop); }
        }

        return filteredLaptops;
    }

}