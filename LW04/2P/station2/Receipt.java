public class Receipt {
    public void print(Ticket t) {
        System.out.println("----- БИЛЕТ -----");
        System.out.println("вид: " + t.getKind() + "  цена: " + Money.lv(t.getPrice()));
        if (t.getKind().equals("M")) {
            System.out.println("име: " + t.getOwner());
        }
        System.out.println("-----------------");
    }
}
