public class BoxOffice {
    private int sold = 0;
    private int cash = 0;

    public void sell(String kind) {
        int price = price(kind);
        sold = sold + 1;
        cash = cash + price;
        System.out.println("продаден " + kind
                + ": " + price + " €");
    }

    public void refund(String kind) {
        if (kind.equals("промо")) {
            throw new UnsupportedOperationException();
        }
        int back = price(kind) - 1;
        sold = sold - 1;
        cash = cash - back;
        System.out.println("върнат " + kind
                + ": " + back + " €");
    }

    public void report() {
        System.out.println("продадени: " + sold
                + ", каса: " + cash + " €");
    }

    private int price(String kind) {
        if (kind.equals("нормален")) {
            return 12;
        } else if (kind.equals("студентски")) {
            return 8;
        } else if (kind.equals("промо")) {
            return 0;
        }
        throw new IllegalArgumentException(kind);
    }
}
