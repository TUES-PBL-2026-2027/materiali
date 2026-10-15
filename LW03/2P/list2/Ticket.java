public class Ticket {
    static int sold = 0;              // колко билета са продадени днес, общо
    private int price = 160;          // стотинки
    private int validatedAt = -1;     // минута от деня; -1 = още не е валидиран

    Ticket() { sold = sold + 1; }

    int price() { return price; }

    void validate(int minute) { validatedAt = minute; }

    boolean isValidAt(int minute) {
        return validatedAt >= 0 && minute - validatedAt <= 30;
    }
}
