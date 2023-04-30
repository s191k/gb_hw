package Lesson_5_OOP.presenters;

import Lesson_5_OOP.models.Table;

import java.util.Collection;
import java.util.Date;

public interface Model {

    Collection<Table> loadTables();

    int reservationTable(Date reservationDate, int tableNo, String name);

    int changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name) throws Exception;

}
