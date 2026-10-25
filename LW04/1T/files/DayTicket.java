public class DayTicket extends Ticket {
    public boolean isValidAt(int minute) {
        return validatedAt() >= 0
            && minute - validatedAt() <= 24 * 60;
    }
}
