public class MonthlyTicket extends Ticket {
    int price() {
        return 5000;
    }

    boolean isValidAt(int minute) {
        return true;
    }
}
