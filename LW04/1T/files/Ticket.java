public class Ticket implements Validatable {
    private int validatedAt = -1;         // минута от деня; -1 = не е валидиран

    void validate(int minute) {
        validatedAt = minute;
    }

    int validatedAt() {
        return validatedAt;
    }

    public boolean isValidAt(int minute) {
        return validatedAt >= 0 && minute - validatedAt <= 30;
    }
}
