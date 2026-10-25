public class Main2 {
    public static void main(String[] args) {
        DayTicket d = new DayTicket();
        d.validate(485);
        System.out.println(d.isValidAt(600)
            + " " + d.validatedAt());
    }
}
