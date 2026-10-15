public class Inspector {
    String name;

    Inspector(String name) { this.name = name; }

    boolean checkTicket(Ticket t, int minute) { return t.isValidAt(minute); }

    boolean checkCard(Card c, int day) { return c.isValidOn(day); }
}
