package Lesson_5_OOP.models;

import Lesson_5_OOP.Exceptions.NoSuchReserveException;
import Lesson_5_OOP.presenters.Model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class TableModel implements Model {


    private Collection<Table> tables;


    /**
     * Получение списка всех столиков
     * @return столики
     */
    public Collection<Table> loadTables(){
        if (tables == null){
            tables = new ArrayList<>();

            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());

        }
        return tables;
    }

    /**
     * Бронирование столика
     * @param reservationDate Дата бронирования
     * @param tableNo номер столика
     * @param name имя клиента
     * @return номер брони
     */
    public int reservationTable(Date reservationDate, int tableNo, String name){
        for (Table table : tables){
            if (table.getNo() == tableNo){
                Reservation reservation = new Reservation(reservationDate, name);
                table.getReservations().add(reservation);
                return reservation.getId();
            }
        }
        return -1;
//        throw new RuntimeException("Невозможно забронировать столик.");
    }

    public void deleteReservationFromTable(int oldReservation, Date reservationDate, int tableNo, String name) throws Exception {
        boolean isRemoved = false;
        for (Table table : tables){
            if (table.getNo() == tableNo){
                isRemoved =table.getReservations().removeIf(
                        curRes -> curRes.getDate().equals(reservationDate) && curRes.getName().equals(name)
                                    && curRes.getId() == oldReservation);
            }
        }

        if(!isRemoved) {
            throw new NoSuchReserveException(String.format("За столиком %d такого резерва нет", tableNo));
        }

        System.out.println("Номер старой брони :: " + oldReservation);

    }


    public int changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name) throws Exception {
        deleteReservationFromTable(oldReservation, reservationDate, tableNo, name);
        return reservationTable(reservationDate, tableNo, name);
    }

}
