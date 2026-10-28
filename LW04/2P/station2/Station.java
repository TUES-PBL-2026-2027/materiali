public class Station {
    private Ticket[] sold = new Ticket[100];
    private int count = 0;
    private int cash = 0;

    public Ticket sell(String kind, String owner) {
        Ticket t = new Ticket(kind, priceOf(kind), owner);
        cash = cash + t.getPrice();
        sold[count] = t;
        count = count + 1;
        return t;
    }

    private int priceOf(String kind) {
        if (kind.equals("S")) {
            return 160;
        } else if (kind.equals("D")) {
            return 400;
        } else if (kind.equals("M")) {
            return 5000;
        }
        return 0;
    }

    public Ticket[] getSold() {
        Ticket[] copy = new Ticket[count];
        for (int i = 0; i < count; i++) {
            copy[i] = sold[i];
        }
        return copy;
    }

    public int getCash() {
        return cash;
    }
}
