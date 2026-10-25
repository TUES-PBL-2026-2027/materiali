public class Main {
    public static void main(String[] args) {
        Ticket[] bought = { new Ticket(), new DayTicket(),
                            new MonthlyTicket(), new StudentTicket() };
        for (int i = 0; i < bought.length; i++) {
            bought[i].validate(485);
            System.out.println(bought[i].price()
                + " " + bought[i].isValidAt(600));
        }
    }
}
