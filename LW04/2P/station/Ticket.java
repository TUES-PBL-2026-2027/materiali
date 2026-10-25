public class Ticket {
    public String kind;          // "S" = еднократен, "D" = дневен, "M" = месечен
    public int price;            // стотинки
    public int validatedAt = -1; // минута от деня
    public String owner;         // само при месечен
}
