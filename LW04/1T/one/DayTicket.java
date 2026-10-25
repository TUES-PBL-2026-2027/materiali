public class DayTicket extends Ticket {
    int price() {
        return 400;
    }

    boolean isValidAt(int minute) {
        return passed(minute) <= 24 * 60;
    }
}
