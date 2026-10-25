public class Main3 {
    public static void main(String[] args) {
        Ticket[] bought = { new Ticket(), new DayTicket() };
        for (int i = 0; i < bought.length; i++) {
            bought[i].validate(485);
            System.out.println(bought[i].isValidAt(600));
        }
    }
}
