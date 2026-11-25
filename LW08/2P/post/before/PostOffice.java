public class PostOffice {
    private int count = 0;
    private int total = 0;

    public void send(String kind) {
        int price = price(kind);
        count = count + 1;
        total = total + price;
        System.out.println(kind
                + ": " + price + " €");
    }

    public void insure(String kind) {
        if (kind.equals("писмо")) {
            throw new UnsupportedOperationException();
        }
        int extra = price(kind) / 2;
        total = total + extra;
        System.out.println("застраховка " + kind
                + ": " + extra + " €");
    }

    public void report() {
        System.out.println("пратки: "
                + count + ", общо: "
                + total + " €");
    }

    private int price(String kind) {
        if (kind.equals("писмо")) {
            return 2;
        } else if (kind.equals("колет")) {
            return 6;
        } else if (kind.equals("експресна")) {
            return 10;
        }
        throw new IllegalArgumentException(kind);
    }
}
