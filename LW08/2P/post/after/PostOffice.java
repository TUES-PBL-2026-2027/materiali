public class PostOffice {
    private final Output out;
    private int count = 0;
    private int total = 0;

    public PostOffice(Output out) {
        this.out = out;
    }

    public void send(Shipment s) {
        count = count + 1;
        total = total + s.price();
        out.line(s.name()
                + ": " + s.price() + " €");
    }

    public void insure(Insurable s) {
        int extra = s.insurance();
        total = total + extra;
        out.line("застраховка " + s.name()
                + ": " + extra + " €");
    }

    public void report() {
        out.line("пратки: "
                + count + ", общо: "
                + total + " €");
    }
}
