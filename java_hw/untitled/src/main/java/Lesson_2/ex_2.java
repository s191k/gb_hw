package Lesson_2;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.Collection;

public class ex_2 {

    class Student {
        String фамилия;
        int оценка;
        String предмет;

        @Override
        public String toString() {
            return String.join(" ","Студент", фамилия, "получил", String.valueOf(оценка),
                    "по предмету", предмет);
        }
    }

    public static void main(String[] args) {
        String jsonString = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}, {\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}, {\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";
        Gson gson = new Gson();
        Type collectionType = new TypeToken<Collection<Student>>(){}.getType();
        Collection<Student> parsedStudents = gson.fromJson(jsonString, collectionType);
        for (Student curStudent: parsedStudents ) {
            System.out.println(curStudent);
        }


    }





//    2. Дана строка json:
//            [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"}, {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"}, {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
//    Написать метод, который распарсит этот текст и, используя StringBuilder, создаст строки вида:
//    Студент [фамилия] получил [оценка] по предмету [предмет]. Например:
//    Студент Иванов получил 5 по предмету Математика.
//    Студент Петрова получил 4 по предмету Информатика.
//    Студент Краснов получил 5 по предмету Физика.

}
