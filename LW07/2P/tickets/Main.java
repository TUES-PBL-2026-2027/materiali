public class Main {
    public static void main(String[] args) {
        Ticket[] sold = {
            new SingleTicket(),
            new DayTicket()
        };
        for (Ticket t : sold) {
            int p = t.price();
            int m = t.minutes();
            System.out.println(p + " ст, " + m + " мин");
        }
    }
}
