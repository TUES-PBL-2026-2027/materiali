public class Ticket {
    private String kind;          // "S" = еднократен, "D" = дневен, "M" = месечен
    private int price;            // стотинки
    private int validatedAt = -1; // минута от деня
    private String owner;         // само при месечен

    public Ticket(String kind, int price, String owner) {
        this.kind = kind;
        this.price = price;
        this.owner = owner;
    }

    public void validate(int minute) {
        validatedAt = minute;
    }

    public boolean isValid(int minute) {
        if (kind.equals("M")) {
            return true;
        }
        if (validatedAt < 0) {
            return false;
        }
        if (kind.equals("S")) {
            return minute - validatedAt <= 30;
        } else if (kind.equals("D")) {
            return minute - validatedAt <= 24 * 60;
        }
        return false;
    }

    public String getKind() {
        return kind;
    }

    public int getPrice() {
        return price;
    }

    public String getOwner() {
        return owner;
    }
}
