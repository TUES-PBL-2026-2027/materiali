public class Main1 {
    public static void main(String[] args) {
        Ticket t = new Ticket();
        t.validate(485);
        System.out.println(t.isValidAt(500)
            + " " + t.isValidAt(600));
    }
}
