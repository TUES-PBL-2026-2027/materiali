public class Shop {
    public static void main(String[] args) {
        Ticket t = new Ticket();
        t.validatedAt = 400;
        Validator.validate(t, 400);
        Ticket u = new Ticket(160);
        Ticket[] today = new Ticket[2];
        today[2] = t;
        Inspector i = new Inspector();
        System.out.println(t.isValidAt(420));
    }
}
