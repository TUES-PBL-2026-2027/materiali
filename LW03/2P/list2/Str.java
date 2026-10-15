public class Str {
    public static void main(String[] args) {
        String a = "Tram 10";
        String b = a;
        b = b + "!";
        Ticket x = new Ticket();
        Ticket y = new Ticket();
        Card c = new Card(new String("Ivan"), 300);
        System.out.println(a + " " + b + " " + Ticket.sold + " " + x.price());
        System.out.println(c.owner() == "Ivan");
        System.out.println(c.owner().equals("Ivan"));
    }
}
