public class Inspector {
    public void check(Ticket t, int minute) {
        if (t.isValid(minute)) {
            System.out.println("OK");
        } else {
            System.out.println("ГЛОБА");
        }
    }
}
