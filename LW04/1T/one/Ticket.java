public class Ticket {
    private int validatedAt = -1;

    void validate(int minute) {
        validatedAt = minute;
    }

    int passed(int minute) {
        return minute - validatedAt;
    }

    int price() {
        return 160;
    }

    boolean isValidAt(int minute) {
        return validatedAt >= 0 && passed(minute) <= 30;
    }
}
