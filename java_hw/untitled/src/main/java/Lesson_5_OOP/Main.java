package Lesson_5_OOP;

import Lesson_5_OOP.models.TableModel;
import Lesson_5_OOP.presenters.BookingPresenter;
import Lesson_5_OOP.views.BookingView;

import java.util.Date;

public class Main {

    public static void main(String[] args) throws Exception {
        TableModel model = new TableModel();
        BookingView view = new BookingView();
        BookingPresenter bookingPresenter = new BookingPresenter(model, view);

        bookingPresenter.loadTables();
        bookingPresenter.updateView();

        Date tempDate = new Date();
        view.reservationTable(tempDate, 2, "Станислав");
        view.reservationTable(new Date(), 3, "Станислав");
        view.reservationTable(new Date(), 4, "Станислав");

        view.changeReservationTable(1001, tempDate, 2, "Станислав");
// Как пример :: Кидает ошибку        view.changeReservationTable(1002, new Date(), 1, "Станислав");

    }

}